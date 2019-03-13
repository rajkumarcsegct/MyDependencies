package com.own.raj.mydependencies.common.di;


import com.own.raj.mydependencies.common.Helper.SharedPrefHelper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
   // void Inject(MyApplication myApplication);

    SharedPrefHelper getSharedPrefHelper();

}
