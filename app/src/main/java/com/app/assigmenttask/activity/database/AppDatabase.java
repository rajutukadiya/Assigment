package com.app.assigmenttask.activity.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.app.assigmenttask.activity.database.dao.UsersDao;
import com.app.assigmenttask.activity.database.model.User;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsersDao userDao();
}
