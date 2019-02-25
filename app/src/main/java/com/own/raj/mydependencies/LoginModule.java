package com.own.raj.mydependencies;

import com.own.raj.mydependencies.Helper.DataHelper;
import com.own.raj.mydependencies.Helper.LoginHelper;

import javax.inject.Singleton;

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
