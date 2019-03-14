package com.own.raj.mydependencies.login;


import android.view.View;

public interface LoginContractor {

    interface Presenter{

        void doAuthentication();

        void setView(LoginView view);



    }

    interface LoginView{

        void showLoading();
        void onAuthenticationCompleted(boolean isSuccess);

    }
}
