package com.own.raj.mydependencies.login;

public interface LoginContractor {

    interface Presenter{

        void loginTapped();

        void setView(LoginView view);



    }

    interface LoginView{

        void showLoading();
        void onAuthenticationCompleted(boolean isSuccess);

    }
}
