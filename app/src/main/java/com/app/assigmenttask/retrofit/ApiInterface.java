package com.app.assigmenttask.retrofit;

import com.app.assigmenttask.activity.homescreen.model.RerestaurantModel;
import com.app.assigmenttask.activity.homescreen.request.ReqRestaurants;
import com.app.assigmenttask.activity.seated.model.SeatedModel;
import com.app.assigmenttask.activity.seated.request.ReqSeated;
import com.app.assigmenttask.activity.tableview.model.FloorsTableModel;
import com.app.assigmenttask.activity.tableview.request.ReqTableView;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("summerize_api/api/v1/users/restaurants")
    Call<RerestaurantModel> getAllRestaurants(@Body ReqRestaurants reqRestaurants);

    @POST("api/floorView/getFloorData.json")
    Call<SeatedModel> getSeatedData(@Body ReqSeated reqSeated);


    @POST("api/floorView/getFloorsTableDetails.json")
    Call<FloorsTableModel> getTableViewData(@Body ReqTableView reqTableView);

}
