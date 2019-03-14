package com.own.raj.mydependencies.login;

import android.util.Log;
import android.view.View;

import javax.inject.Inject;

public class LoginPresenterImpl implements LoginContractor.Presenter{

    LoginContractor.LoginView view;
    LoginInteractor loginInteractor;


    @Inject
    public LoginPresenterImpl(LoginInteractor interactor){
     this.loginInteractor=interactor;
    }

    @Override
    public void doAuthentication() {
        view.showLoading();

        // authentication code
        boolean status=loginInteractor.doAthentication();

        view.onAuthenticationCompleted(status);
    }

    @Override
    public void setView(LoginContractor.LoginView view) {

       this.view=view;
    }
}
