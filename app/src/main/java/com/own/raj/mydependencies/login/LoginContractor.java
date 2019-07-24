package com.own.raj.mydependencies.login;

public interface LoginContractor {

    interface Presenter{

        void setView(LoginView view);
        void loginTapped();

    }

    interface LoginView{

        void showLoading();
        void onAuthenticationCompleted(boolean isSuccess);

    }
}
