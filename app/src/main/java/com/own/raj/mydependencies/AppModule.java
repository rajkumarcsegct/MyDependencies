package com.own.raj.mydependencies;

import android.content.Context;
import android.content.SharedPreferences;

import com.own.raj.mydependencies.Helper.DataHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public String  getDBNameee(){
        return "v19";
    }


    @Provides
    public int  getDBVerrrr(){
        return 19;
    }


}


