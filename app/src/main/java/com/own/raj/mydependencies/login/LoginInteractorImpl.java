package com.own.raj.mydependencies.login;

import com.own.raj.mydependencies.qualifier.DBName;

import javax.inject.Inject;

public class LoginInteractorImpl implements LoginInteractor {

    String dbName;
    int version;
    @Inject
    public LoginInteractorImpl(@DBName String dbName, int version){

        this.dbName=dbName;
        this.version=version;
    }

    @Override
    public boolean attemptLogin() {

        return false;
    }
}
