package com.own.raj.mydependencies;

import com.own.raj.mydependencies.Helper.LoginHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginHelper getLoginHelper(){
        return new LoginHelper();
    }
}
