package com.own.raj.mydependencies;

import javax.inject.Singleton;

import Scope.PerActivity;
import dagger.Component;
import dagger.Subcomponent;


@Component(dependencies = AppComponent.class,modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity mainActivity);

}
