package com.own.raj.mydependencies.Helper;

import android.util.Log;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Named;

public class DataHelper {

    String dbName;
    int version;

    @Inject
    public DataHelper(String dbName, int version){

        this.dbName=dbName;
        this.version=version;
    }

    @Inject
    public void saveStatus(ArrayList<Integer> data){

        Log.d("test",data+"");
    }

    public  void insertData(String value){

    }
}
