package com.own.raj.mydependencies;

import android.content.Context;
import android.content.SharedPreferences;

import com.own.raj.mydependencies.Helper.DataHelper;
import com.own.raj.mydependencies.Helper.SharedPrefHelper;

import java.util.ArrayList;

import javax.inject.Named;
import javax.inject.Singleton;

import Scope.PerActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;
    public AppModule(Context context){
        this.context=context;
    }

    @Singleton
    @Provides
    public SharedPrefHelper getSharedPrefHelper(){
        return new SharedPrefHelper(context);
    }



}


