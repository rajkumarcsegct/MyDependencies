package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.common.Helper.DataHelper;
import com.own.raj.mydependencies.login.LoginHelper;

import Scope.PerActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    @PerActivity
    public LoginHelper getLoginHelper(){
        return new LoginHelper();
    }

    @Provides
    //@PerActivity
    public DataHelper getDataHelper(){
        return new DataHelper();
    }
}
