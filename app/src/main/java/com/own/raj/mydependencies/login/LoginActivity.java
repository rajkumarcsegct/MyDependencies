package com.own.raj.mydependencies.login;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.own.raj.mydependencies.common.Helper.DataHelper;
import com.own.raj.mydependencies.R;
import com.own.raj.mydependencies.common.Helper.SharedPrefHelper;
import com.own.raj.mydependencies.login.di.DaggerLoginComponent;
import com.own.raj.mydependencies.login.di.LoginComponent;
import com.own.raj.mydependencies.login.di.LoginModule;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginContractor.LoginView {

    @Inject
    LoginContractor.Presenter loginPresenter;

    Button button;

    LoginComponent loginComponent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myactivity);


       // AppComponent appComponent=DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        //loginComponent=appComponent.plusLoginComponent();
        loginComponent= DaggerLoginComponent.builder().loginModule(new LoginModule()).build();
        loginComponent.inject(this);
        loginPresenter.setView(this);
       // loginHelper.isAuthenticateSuccess();

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.doAuthentication();
               // Toast.makeText(LoginActivity.this,dataHelper.getDate().toString(),Toast.LENGTH_LONG).show();
               // Log.d("test2",dataHelper.getDate());
            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void showLoading() {

        // show progress dialog
    }

    @Override
    public void onAuthenticationCompleted(boolean isSuccess) {

        // Do activity based on the status
    }
}
