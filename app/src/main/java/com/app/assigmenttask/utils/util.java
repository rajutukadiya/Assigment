package com.app.assigmenttask.utils;

import android.content.Context;
import android.widget.Toast;

public class util {

    public static String dataBaseName="restaurant";
    public static String BASE_URL="https://dev-api.summerize.io/";
    public static String BASE_URL_="https://dev-restaurants.summerize.io/";

    public static void showMessage(Context context, int msg) {
        Toast.makeText(context, context.getString(msg), Toast.LENGTH_SHORT).show();
    }
}

