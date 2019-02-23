package com.own.raj.mydependencies;

import android.content.Context;
import android.content.SharedPreferences;

import com.own.raj.mydependencies.Helper.DataHelper;

import java.util.ArrayList;

import javax.inject.Named;

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

    @Provides
    public ArrayList<Integer> getData(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        return list;
    }

}


