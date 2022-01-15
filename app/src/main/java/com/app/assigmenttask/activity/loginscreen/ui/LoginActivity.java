package com.app.assigmenttask.activity.loginscreen.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.app.assigmenttask.BaseActivity;
import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.database.model.User;
import com.app.assigmenttask.activity.homescreen.ui.HomeActivity;
import com.app.assigmenttask.activity.registerscreen.ui.RegisterActivity;
import com.app.assigmenttask.application.MyApplication;
import com.app.assigmenttask.databinding.ActivityLoginBinding;
import com.app.assigmenttask.utils.Util;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    public String strEmailOrPhone = "", strPassword = "";
    private ActivityLoginBinding activityLoginBinding;

    @Override
    protected View getLayoutResourceId() {
        activityLoginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        return activityLoginBinding.getRoot();
    }

    @Override
    protected void initialization() {

    }

    @Override
    protected void listener() {
        activityLoginBinding.btnRegister.setOnClickListener(this);
        activityLoginBinding.btnLogin.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRegister:
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.btnLogin:
                checkLogin(LoginActivity.this);
                break;
        }

    }

    public void checkLogin(Context context) {
        strEmailOrPhone = activityLoginBinding.edtEmailorPassword.getText().toString().trim();
        strPassword = activityLoginBinding.edtPassword.getText().toString().trim();
        if (strEmailOrPhone.isEmpty()) {
            Util.showMessage(context, R.string.empty_email_or_phone);
        } else if (strPassword.isEmpty()) {
            Util.showMessage(context, R.string.empty_password);
        } else {

            if (findUser() != null) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            } else {
                Util.showMessage(context, R.string.invalid_credentials);
            }
        }
    }


    private User findUser() {
        {
            return ((MyApplication) getApplicationContext()).getMyDatabase().userDao().findUser(strEmailOrPhone, strPassword);
        }
    }
}