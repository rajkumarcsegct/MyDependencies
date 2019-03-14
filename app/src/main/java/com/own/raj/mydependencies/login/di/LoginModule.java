package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.common.Helper.DataHelper;
import com.own.raj.mydependencies.login.LoginContractor;
import com.own.raj.mydependencies.login.LoginHelper;
import com.own.raj.mydependencies.login.LoginInteractor;
import com.own.raj.mydependencies.login.LoginPresenterImpl;

import Scope.PerActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginInteractor getLoginInteractor(){
        return new LoginHelper();
    }

    @Provides
    public LoginContractor.Presenter getLoginPresenter(LoginInteractor interactor){
        return new LoginPresenterImpl(interactor);
    }




}
