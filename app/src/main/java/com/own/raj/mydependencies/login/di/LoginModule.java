package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.login.LoginInteractorImpl;
import com.own.raj.mydependencies.login.LoginPresenterImpl;

import Scope.PerActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {


    @PerActivity
    @Provides
    public LoginPresenterImpl getLoginPresenter(LoginInteractorImpl loginInteractor){
        return new LoginPresenterImpl(loginInteractor);
    }
}
