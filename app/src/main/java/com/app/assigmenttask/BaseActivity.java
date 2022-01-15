package com.app.assigmenttask;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.app.assigmenttask.activity.database.AppDatabase;
import com.app.assigmenttask.utils.util;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        initialization();
        listener();
    }

    protected abstract View getLayoutResourceId();

    protected abstract void initialization();

    protected abstract void listener();

    protected AppDatabase getDatabaseInstance() {
        return Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, util.dataBaseName).build();
    }

}