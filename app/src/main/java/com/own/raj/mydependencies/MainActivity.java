package com.own.raj.mydependencies;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.JavascriptInterface;

import com.own.raj.mydependencies.Helper.DataHelper;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    DataHelper dataHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myactivity);

        AppComponent appComponent=DaggerAppComponent.builder().appModule(new AppModule()).build();
        appComponent.Inject(this);

        dataHelper.insertData("test");

    }


}
