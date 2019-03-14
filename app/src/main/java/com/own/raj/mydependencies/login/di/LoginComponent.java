package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.login.LoginActivity;
import com.own.raj.mydependencies.common.di.AppComponent;

import Scope.PerActivity;
import dagger.Component;


@Component(modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);

}
