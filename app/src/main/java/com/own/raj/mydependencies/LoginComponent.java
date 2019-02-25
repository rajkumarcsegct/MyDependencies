package com.own.raj.mydependencies;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);


}

