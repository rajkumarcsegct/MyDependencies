package com.own.raj.mydependencies.common.di;

import android.content.Context;

import com.own.raj.mydependencies.common.Helper.SharedPrefHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;
    public AppModule(Context context){
        this.context=context;
    }

    @Provides
    @Singleton
    public SharedPrefHelper getSharedPrefHelper(){
        return new SharedPrefHelper(context);
    }



}


