package com.own.raj.mydependencies.login;

import javax.inject.Inject;

public class LoginPresenterImpl implements LoginContractor.Presenter{

    LoginContractor.LoginView view;
    LoginInteractor loginInteractor;
    String dbName;
    int version;

    @Inject
    public LoginPresenterImpl(String dbName, int version){
     loginInteractor=new LoginInteractorImpl();

        this.dbName=dbName;
        this.version=version;
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
