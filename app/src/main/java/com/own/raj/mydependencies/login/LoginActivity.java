package com.own.raj.mydependencies.login;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

        // We are depending on ClassB(LoginPresenter), but it depends on some other values or objects, so the loops goes on..
      //  loginPresenter=new LoginPresenterImpl(Param1,param2,Param3);

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
    // Show alert dialog
    }

    @Override
    public void onAuthenticationCompleted(boolean isSuccess) {

        if(isSuccess)
            Toast.makeText(this,"Logged in Successfully",Toast.LENGTH_LONG).show();
        else Toast.makeText(this,"Error in Authentication",Toast.LENGTH_LONG).show();

    }
}
