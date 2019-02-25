package com.own.raj.mydependencies;

import android.app.Application;

import com.own.raj.mydependencies.Helper.SharedPrefHelper;

import javax.inject.Inject;

public class MyApplication extends Application {


    @Inject
    SharedPrefHelper sharedPrefHelper;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        AppComponent appComponent=DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.Inject(this);
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
