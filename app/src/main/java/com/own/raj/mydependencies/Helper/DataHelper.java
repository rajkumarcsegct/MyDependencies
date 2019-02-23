package com.own.raj.mydependencies.Helper;

import javax.inject.Inject;

public class DataHelper {

    String dbName;
    int version;

    public DataHelper(){

    }

    @Inject
    public DataHelper(String dbName,int version){

        this.dbName=dbName;
        this.version=version;
    }

    public  void insertData(String value){

    }
}
