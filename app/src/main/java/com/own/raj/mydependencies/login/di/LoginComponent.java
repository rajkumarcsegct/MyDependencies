package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.login.LoginActivity;
import com.own.raj.mydependencies.login.LoginPresenterImpl;

import dagger.Component;

@Component(modules = LoginModule.class)
public interface LoginComponent {

    void Inject(LoginActivity activity);
  //  void Inject(LoginPresenterImpl activity);

    //DataMember dataMember();
}
