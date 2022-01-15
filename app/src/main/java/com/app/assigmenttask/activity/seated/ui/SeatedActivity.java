package com.app.assigmenttask.activity.seated.ui;

import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.app.assigmenttask.BaseActivity;
import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.seated.adapter.SeatedAdapter;
import com.app.assigmenttask.activity.seated.model.SeatedModel;
import com.app.assigmenttask.activity.seated.request.ReqSeated;
import com.app.assigmenttask.databinding.ActivitySeatedBinding;
import com.app.assigmenttask.retrofit.RetrofitClient;
import com.app.assigmenttask.utils.InternetConnection;
import com.app.assigmenttask.utils.Util;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeatedActivity extends BaseActivity {

    private ActivitySeatedBinding activitySeatedBinding;

    @Override
    protected View getLayoutResourceId() {
        activitySeatedBinding = ActivitySeatedBinding.inflate(getLayoutInflater());
        return activitySeatedBinding.getRoot();
    }

    @Override
    protected void initialization() {
        if (InternetConnection.checkConnection(SeatedActivity.this)) {
            getSeatedList();
        } else {
            Util.showMessage(SeatedActivity.this, R.string.pleasecheckinternetconnection);
        }

    }

    @Override
    protected void listener() {

    }

    private void getSeatedList() {
        activitySeatedBinding.progressbar.setVisibility(View.VISIBLE);
        ReqSeated reqSeated = new ReqSeated();
        reqSeated.setType("Seated");
        reqSeated.setCurrent_date("2021-11-10");
        reqSeated.setPropertyId(181);

        Call<SeatedModel> call = RetrofitClient.getInstance(null).getMyApi().getSeatedData(reqSeated);
        call.enqueue(new Callback<SeatedModel>() {
            @Override
            public void onResponse(@NonNull Call<SeatedModel> call, @NonNull Response<SeatedModel> response) {
                activitySeatedBinding.progressbar.setVisibility(View.GONE);
                List<SeatedModel.FloorsDTO> seatedList = response.body().getFloors();
                SeatedAdapter adapter = new SeatedAdapter(seatedList, SeatedActivity.this);
                activitySeatedBinding.rlSeated.setHasFixedSize(true);
                activitySeatedBinding.rlSeated.setLayoutManager(new LinearLayoutManager(SeatedActivity.this));
                activitySeatedBinding.rlSeated.setAdapter(adapter);

            }

            @Override
            public void onFailure(@NonNull Call<SeatedModel> call, @NonNull Throwable t) {
                activitySeatedBinding.progressbar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
    }
}