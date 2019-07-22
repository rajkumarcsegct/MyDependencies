package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.AppComponent;
import com.own.raj.mydependencies.login.LoginActivity;
import com.own.raj.mydependencies.login.LoginInteractorImpl;

import dagger.Component;


@Component(dependencies = AppComponent.class,modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);

}
