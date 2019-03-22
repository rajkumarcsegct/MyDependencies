package com.own.raj.mydependencies;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.own.raj.mydependencies.Helper.DataHelper;
import com.own.raj.mydependencies.Helper.LoginHelper;
import com.own.raj.mydependencies.Helper.SharedPrefHelper;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    @Inject
    LoginHelper loginHelper;

    @Inject
    DataHelper dataHelper;

    @Inject
    SharedPrefHelper sharedPrefHelper;

    Button button;

    LoginComponent loginComponent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myactivity);

        loginComponent= DaggerLoginComponent.builder().loginModule(new LoginModule()).build();
        loginComponent.inject(this);

        loginHelper.isAuthenticateSuccess();

        sharedPrefHelper.write("test","test");



        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(LoginActivity.this,dataHelper.getDate().toString(),Toast.LENGTH_LONG).show();
               // Log.d("test2",dataHelper.getDate());
            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
