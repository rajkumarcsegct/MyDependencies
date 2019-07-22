package com.own.raj.mydependencies.login.di;

import com.own.raj.mydependencies.AppComponent;
import com.own.raj.mydependencies.login.LoginActivity;

import Scope.PerActivity;
import dagger.Component;
import dagger.Subcomponent;


@PerActivity
@Subcomponent(modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);

}
