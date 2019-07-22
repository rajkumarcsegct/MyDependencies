package com.own.raj.mydependencies.login;

import javax.inject.Inject;

public class LoginPresenterImpl implements LoginContractor.Presenter{

    LoginContractor.LoginView view;
    LoginInteractorImpl loginInteractor;


    @Inject
    public LoginPresenterImpl(LoginInteractorImpl loginInteractor){
        this.loginInteractor=loginInteractor;
    }

    @Override
    public void loginTapped() {
        view.showLoading();

        // authentication code
        boolean status=loginInteractor.attemptLogin();

        view.onAuthenticationCompleted(status);
    }

    @Override
    public void setView(LoginContractor.LoginView view) {

       this.view=view;
    }
}
