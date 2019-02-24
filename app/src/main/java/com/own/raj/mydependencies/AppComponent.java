package com.own.raj.mydependencies;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void Inject(MyApplication myApplication);

}
