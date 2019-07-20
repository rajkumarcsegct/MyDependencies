package com.own.raj.mydependencies.login;

import com.own.raj.mydependencies.Common.DBUtil;
import com.own.raj.mydependencies.Common.SharedPrefHelper;

import javax.inject.Inject;

public class LoginInteractorImpl implements LoginInteractor {


    @Inject
    private SharedPrefHelper sharedPrefHelper;

    @Inject
    private DBUtil dbUtil;

    @Override
    public boolean attemptLogin() {

        dbUtil.openDataBase();
        // Fetch user data..

        sharedPrefHelper.write("userName","Raj");

        return false;
    }
}
