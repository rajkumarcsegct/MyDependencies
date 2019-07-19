package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.login.LoginActivity;

import dagger.Component;

@Component(modules = LoginModule.class)
public interface LoginComponent {

    void Inject(LoginActivity activity);

    //DataMember dataMember();
}
