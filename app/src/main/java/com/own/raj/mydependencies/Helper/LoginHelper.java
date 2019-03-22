package com.own.raj.mydependencies.Helper;

import javax.inject.Inject;

public class LoginHelper {

    String dbName;
    int version;

    @Inject
    public LoginHelper(String dbName, int version){

        this.dbName=dbName;
        this.version=version;
    }

    public  void insertData(String value){

    }
}
