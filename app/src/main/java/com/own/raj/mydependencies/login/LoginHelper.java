package com.own.raj.mydependencies.login;

public class LoginHelper implements LoginInteractor {

    public boolean isAuthenticateSuccess(){

        return true;
    }

    @Override
    public boolean attemptLogin() {

        return false;
    }
}
