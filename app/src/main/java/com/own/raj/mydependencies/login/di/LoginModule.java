package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.Common.DataHelper;
import com.own.raj.mydependencies.Common.LoginHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginHelper getLoginHelper(){
        return new LoginHelper();
    }

    @Provides
    public DataHelper getDataHelper(){
        return new DataHelper();
    }
}
