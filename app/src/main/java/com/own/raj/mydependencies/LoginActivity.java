package com.own.raj.mydependencies;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.own.raj.mydependencies.Helper.LoginHelper;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    @Inject
    LoginHelper dataHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myactivity);

        LoginComponent appComponent=DaggerLoginComponent.builder().loginModule(new LoginModule()).build();
        appComponent.Inject(this);

        dataHelper.insertData("test");

    }


}
