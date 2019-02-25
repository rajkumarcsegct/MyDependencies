package com.own.raj.mydependencies;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;


@Subcomponent(modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);

}
