package com.own.raj.mydependencies.common;

import android.app.Application;

public class MyApplication extends Application {


   /* @Inject
    SharedPrefHelper sharedPrefHelper;*/

   // AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        /* appComponent=DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.Inject(this);*/
    }

    /*public AppComponent getAppComponent(){
        return appComponent;
    }*/
}
