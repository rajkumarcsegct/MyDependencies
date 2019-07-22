package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.login.LoginInteractorImpl;
import com.own.raj.mydependencies.login.LoginPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {


    @Provides
    public LoginPresenterImpl getLoginPresenter(LoginInteractorImpl loginInteractor){
        return new LoginPresenterImpl(loginInteractor);
    }
}
