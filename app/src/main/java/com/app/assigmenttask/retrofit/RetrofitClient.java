package com.app.assigmenttask.retrofit;

import com.app.assigmenttask.utils.util;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    HostSelectionInterceptor hostSelectionInterceptor = null;
    private ApiInterface myApi;

    private RetrofitClient(HostSelectionInterceptor hostSelectionInterceptor) {
        this.hostSelectionInterceptor = hostSelectionInterceptor;
        OkHttpClient okHttpClient;
        Retrofit retrofit = null;
        if (hostSelectionInterceptor != null) {
            okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(hostSelectionInterceptor)
                    .build();
            retrofit = new Retrofit.Builder().baseUrl(util.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .callFactory(okHttpClient)
                    .build();
        } else {
            retrofit = new Retrofit.Builder().baseUrl(util.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        myApi = retrofit.create(ApiInterface.class);
    }

    public static synchronized RetrofitClient getInstance(HostSelectionInterceptor hostSelectionInterceptor) {
        if (instance == null) {
            instance = new RetrofitClient(hostSelectionInterceptor);
        }
        return instance;
    }

    public ApiInterface getMyApi() {

        return myApi;
    }

}