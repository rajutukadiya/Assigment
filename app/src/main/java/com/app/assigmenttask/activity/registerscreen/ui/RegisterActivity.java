package com.app.assigmenttask.activity.registerscreen.ui;

import android.content.Context;
import android.content.Intent;
import android.util.Patterns;
import android.view.View;

import com.app.assigmenttask.BaseActivity;
import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.database.dao.UsersDao;
import com.app.assigmenttask.activity.database.model.User;
import com.app.assigmenttask.activity.loginscreen.ui.LoginActivity;
import com.app.assigmenttask.application.MyApplication;
import com.app.assigmenttask.databinding.ActivityRegisterBinding;
import com.app.assigmenttask.utils.Util;

import java.util.regex.Pattern;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {


    private ActivityRegisterBinding activityRegisterBinding;
    private String strName, strEmail, strPhone, strPassword;

    @Override
    protected View getLayoutResourceId() {
        activityRegisterBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        return activityRegisterBinding.getRoot();
    }

    @Override
    protected void initialization() {

    }

    @Override
    protected void listener() {
        activityRegisterBinding.btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnRegister) {
            if (isValid(RegisterActivity.this)) {

                addUserInfromation();

            }
        }
    }

    private void addUserInfromation() {
        User user = new User();
        user.setName(strName);
        user.setNumber(strPhone);
        user.setEmail(strEmail);
        user.setPassword(strPassword);
        // Get the DAO
        final UsersDao userDao = ((MyApplication) getApplicationContext()).getMyDatabase().userDao();

        // Define the task
        ((MyApplication) getApplicationContext()).getMyDatabase().runInTransaction(() -> {
            userDao.add(user);
            Util.showMessage(RegisterActivity.this, R.string.successfully_registered);
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private Boolean isValid(Context context) {
        strName = activityRegisterBinding.edtName.getText().toString().trim();
        strEmail = activityRegisterBinding.edtEmail.getText().toString().trim();
        strPhone = activityRegisterBinding.edtPhone.getText().toString().trim();
        strPassword = activityRegisterBinding.edtPassword.getText().toString().trim();
        if (strName.isEmpty()) {
            Util.showMessage(context, R.string.valid_name);
            return false;
        } else if (strEmail.isEmpty()) {
            Util.showMessage(context, R.string.empty_email);
            return false;
        } else if (!Pattern.matches(Patterns.EMAIL_ADDRESS.toString(), strEmail)) {
            Util.showMessage(context, R.string.valid_email);
            return false;
        } else if (strPhone.isEmpty()) {
            Util.showMessage(context, R.string.empty_phone);
            return false;
        } else if (strPassword.isEmpty()) {
            Util.showMessage(context, R.string.empty_password);
            return false;
        }
        return true;
    }
}