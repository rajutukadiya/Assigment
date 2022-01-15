package com.app.assigmenttask.activity.tableview.ui;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.app.assigmenttask.BaseActivity;
import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.tableview.model.FloorsTableModel;
import com.app.assigmenttask.activity.tableview.request.ReqTableView;
import com.app.assigmenttask.databinding.ActivityTableViewBinding;
import com.app.assigmenttask.retrofit.RetrofitClient;
import com.app.assigmenttask.utils.InternetConnection;
import com.app.assigmenttask.utils.util;

import java.util.List;

import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.request.ImageRequest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TableViewActivity extends BaseActivity {


    private ActivityTableViewBinding activityTableViewBinding;

    @Override
    protected View getLayoutResourceId() {
        activityTableViewBinding = ActivityTableViewBinding.inflate(getLayoutInflater());
        return activityTableViewBinding.getRoot();
    }

    @Override
    protected void initialization() {
        if (InternetConnection.checkConnection(TableViewActivity.this)) {
            getTableDetails();
        } else {
            util.showMessage(TableViewActivity.this, R.string.pleasecheckinternetconnection);
        }

    }


    @Override
    protected void listener() {

    }


    private void getTableDetails() {
        activityTableViewBinding.progressbar.setVisibility(View.VISIBLE);
        ReqTableView reqTableView = new ReqTableView();
        reqTableView.setBookingDate("2021-11-10");
        reqTableView.setFloor_id("380");
        reqTableView.setTime_hour("15");
        reqTableView.setTime_minute("53");
        Call<FloorsTableModel> call = RetrofitClient.getInstance(null).getMyApi().getTableViewData(reqTableView);
        call.enqueue(new Callback<FloorsTableModel>() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onResponse(@NonNull Call<FloorsTableModel> call, @NonNull Response<FloorsTableModel> response) {
                activityTableViewBinding.progressbar.setVisibility(View.GONE);
                List<FloorsTableModel.OutputDTO.FloorTableDetailsDTO> floorTableDetailsList = response.body().getOutput().getFloorTableDetails();
                for (FloorsTableModel.OutputDTO.FloorTableDetailsDTO floorTableDetails :
                        floorTableDetailsList) {
                    ImageView imgTableView = new ImageView(TableViewActivity.this);
                    imgTableView.setLayoutParams(new android.view.ViewGroup.LayoutParams(80, 60));
                    imgTableView.setMaxHeight(20);
                    imgTableView.setMaxWidth(20);
                    imgTableView.setX(floorTableDetails.getX_position());
                    imgTableView.setY(floorTableDetails.getY_position());

                    /*ImageRequest imageLoader = new ImageLoader.Builder(TableViewActivity.this)
                            .componentRegistry(new ComponentRegistry())
                             .build();

                    ImageRequest request = new ImageRequest.Builder(TableViewActivity.this)
                            .crossfade(true)
                            .crossfade(500)
                            .placeholder(R.drawable.placeholder)
                            .error(R.drawable.placeholder)
                            .data(url)
                            .target(TableViewActivity.this)
                            .build();
                            activityTableViewBinding.clview.addView(imgTableView);*/

                }


            }

            @Override
            public void onFailure(@NonNull Call<FloorsTableModel> call, @NonNull Throwable t) {
                activityTableViewBinding.progressbar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
    }


}