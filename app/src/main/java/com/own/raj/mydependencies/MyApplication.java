package com.own.raj.mydependencies;

import android.app.Application;

public class MyApplication extends Application {




    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent=DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
