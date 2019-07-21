package com.own.raj.mydependencies.login.di;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public String  getDBName(){
        return "v19";
    }


    @Provides
    public int  getDBVer(){
        return 19;
    }


    // THis module can provide the object of LoginPresenter as it provides the param needed for LoginPresenter.
}


