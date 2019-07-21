package com.own.raj.mydependencies.login;

import javax.inject.Inject;

public class LoginInteractorImpl implements LoginInteractor {

    String dbName;
    int version;
    @Inject
    public LoginInteractorImpl(String dbName, int version){

        this.dbName=dbName;
        this.version=version;
    }

    @Override
    public boolean attemptLogin() {

        return false;
    }
}
