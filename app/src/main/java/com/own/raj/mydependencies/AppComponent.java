package com.own.raj.mydependencies;


import com.own.raj.mydependencies.Common.DBUtil;
import com.own.raj.mydependencies.Common.SharedPrefHelper;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
   // void Inject(MyApplication myApplication);


    SharedPrefHelper provideSharedPrefHelper();
    DBUtil provideDBUtil();

}
