package com.own.raj.mydependencies;

import android.content.Context;
import android.content.SharedPreferences;

import com.own.raj.mydependencies.Helper.DataHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public DataHelper getDataMember(){
        return new DataHelper();
    }


}


//Step1 . Module(Class) -->Methods (@Privides)

//step2 . Ijject
