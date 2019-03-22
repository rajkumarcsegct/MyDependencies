package com.own.raj.mydependencies;

import dagger.Component;

@Component(modules = LoginModule.class)
public interface LoginComponent {

    void Inject(LoginActivity activity);

    //DataMember dataMember();
}
