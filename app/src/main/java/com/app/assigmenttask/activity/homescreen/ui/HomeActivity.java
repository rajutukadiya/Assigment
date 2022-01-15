package com.app.assigmenttask.activity.homescreen.ui;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.app.assigmenttask.BaseActivity;
import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.homescreen.adpter.RerestauranAdapter;
import com.app.assigmenttask.activity.homescreen.model.RerestaurantModel;
import com.app.assigmenttask.activity.homescreen.request.ReqRestaurants;
import com.app.assigmenttask.activity.loginscreen.ui.LoginActivity;
import com.app.assigmenttask.activity.registerscreen.ui.RegisterActivity;
import com.app.assigmenttask.databinding.ActivityHomeBinding;
import com.app.assigmenttask.retrofit.HostSelectionInterceptor;
import com.app.assigmenttask.retrofit.RetrofitClient;
import com.app.assigmenttask.utils.InternetConnection;
import com.app.assigmenttask.utils.util;

import java.util.List;

import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends BaseActivity {

    private ActivityHomeBinding activityHomeBinding;

    @Override
    protected View getLayoutResourceId() {
        activityHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        return activityHomeBinding.getRoot();
    }

    @Override
    protected void initialization() {


        if (InternetConnection.checkConnection(HomeActivity.this)) {
            getRestaurant();
        } else {
            util.showMessage(HomeActivity.this, R.string.pleasecheckinternetconnection);
        }


    }

    private void getRestaurant() {
        activityHomeBinding.progressbar.setVisibility(View.VISIBLE);

        ReqRestaurants reqRestaurants = new ReqRestaurants();
        reqRestaurants.setPage(1);
        reqRestaurants.setLatitude(16.230136);
        reqRestaurants.setLongitude(74.3603665);
        HostSelectionInterceptor hostSelectionInterceptor=new HostSelectionInterceptor();
        HttpUrl newUrl = HttpUrl.parse(util.BASE_URL);
        hostSelectionInterceptor.setHost(newUrl);
        Call<RerestaurantModel> call = RetrofitClient.getInstance(hostSelectionInterceptor).getMyApi().getAllRestaurants(reqRestaurants);
        call.enqueue(new Callback<RerestaurantModel>() {
            @Override
            public void onResponse(Call<RerestaurantModel> call, Response<RerestaurantModel> response) {
                activityHomeBinding.progressbar.setVisibility(View.GONE);
                List<RerestaurantModel.DataDTO.RestaurantsDTO.Datam> rerestaurantModelList = response.body().getData().getRestaurants().getData();
                RerestauranAdapter adapter = new RerestauranAdapter(rerestaurantModelList, HomeActivity.this,hostSelectionInterceptor);
                activityHomeBinding.rlview.setHasFixedSize(true);
                activityHomeBinding.rlview.setLayoutManager(new LinearLayoutManager(HomeActivity.this));
                activityHomeBinding.rlview.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<RerestaurantModel> call, Throwable t) {
                activityHomeBinding.progressbar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
    }

    @Override
    protected void listener() {

    }

}