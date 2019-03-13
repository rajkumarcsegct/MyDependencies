package com.own.raj.mydependencies.common.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefHelper {

    String dbName;
    int version;

    Context context;
    SharedPreferences sharedPreferences;
    public SharedPrefHelper(Context context){
        this.context=context;
        sharedPreferences=PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void write(String key,String val){
        sharedPreferences.edit().putString(key,val);
    }



}
