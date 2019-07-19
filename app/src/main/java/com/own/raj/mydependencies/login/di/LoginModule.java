package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.Helper.LoginHelper;
import com.own.raj.mydependencies.login.LoginPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    // It will instantiate and provides dataHelper object.
    @Provides
    public LoginPresenterImpl getLoginPresenter(){
        return new LoginPresenterImpl();
    }


}


