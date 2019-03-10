package com.own.raj.mydependencies;

import com.own.raj.mydependencies.Helper.DataHelper;
import com.own.raj.mydependencies.Helper.LoginHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Singleton
    @Provides
    public LoginHelper getLoginHelper(){
        return new LoginHelper();
    }

    @Provides
    public DataHelper getDataHelper(){
        return new DataHelper();
    }

    @Provides
    public String  getData(){
        return "0";
    }

}
