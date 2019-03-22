package com.own.raj.mydependencies.login;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.own.raj.mydependencies.R;


public class LoginActivity extends AppCompatActivity implements LoginContractor.LoginView {

    LoginPresenterImpl loginPresenter;

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myactivity);


        loginPresenter=new LoginPresenterImpl();
        loginPresenter.setView(this);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.loginTapped();

            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void onAuthenticationCompleted(boolean isSuccess) {


    }
}
