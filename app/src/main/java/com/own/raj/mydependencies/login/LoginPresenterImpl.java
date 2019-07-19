package com.own.raj.mydependencies.login;

public class LoginPresenterImpl implements LoginContractor.Presenter{

    LoginContractor.LoginView view;
    LoginInteractor loginInteractor;


    public LoginPresenterImpl(){
     loginInteractor=new LoginInteractorImpl();
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
