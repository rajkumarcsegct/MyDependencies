package com.own.raj.mydependencies.login;

import com.own.raj.mydependencies.Common.DBUtil;
import com.own.raj.mydependencies.Common.SharedPrefHelper;

import javax.inject.Inject;

public class LoginInteractorImpl implements LoginInteractor {


    SharedPrefHelper sharedPrefHelper;

    DBUtil dbUtil;

    @Inject
    public LoginInteractorImpl(SharedPrefHelper sharedPrefHelper,DBUtil dbUtil){
        this.sharedPrefHelper=sharedPrefHelper;
        this.dbUtil=dbUtil;
    }

    @Override
    public boolean attemptLogin() {

        dbUtil.openDataBase();
        // Fetch user data..

        sharedPrefHelper.write("userName","Raj");

        return false;
    }
}
