package com.own.raj.mydependencies;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {

    void Inject(MainActivity activity);

}
