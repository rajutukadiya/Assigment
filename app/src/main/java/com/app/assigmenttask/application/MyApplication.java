package com.app.assigmenttask.application;

import android.app.Application;

import androidx.room.Room;

import com.app.assigmenttask.activity.database.AppDatabase;
import com.app.assigmenttask.utils.util;

public class MyApplication extends Application {

    AppDatabase appDatabase=null;
    @Override
    public void onCreate() {
        super.onCreate();
        appDatabase= Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, util.dataBaseName).allowMainThreadQueries().build();
    }

    public AppDatabase getMyDatabase() {
        return appDatabase;
    }

}
