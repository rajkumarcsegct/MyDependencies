package com.own.raj.mydependencies;


import com.own.raj.mydependencies.Helper.SharedPrefHelper;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
   // void Inject(MyApplication myApplication);

    // Exposing shared helper to sub component
    SharedPrefHelper getSharedHelper();


}
