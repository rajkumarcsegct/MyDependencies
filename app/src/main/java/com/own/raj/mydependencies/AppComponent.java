package com.own.raj.mydependencies;


import com.own.raj.mydependencies.login.di.LoginComponent;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MyApplication myApplication);

    LoginComponent plusLoginComponent();


}
