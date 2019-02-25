package com.own.raj.mydependencies;

import javax.inject.Singleton;

import dagger.Component;


@Component(dependencies = AppComponent.class,modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);

}
