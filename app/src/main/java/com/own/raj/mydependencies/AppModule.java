package com.own.raj.mydependencies;

import android.content.Context;

import com.own.raj.mydependencies.Common.DBUtil;
import com.own.raj.mydependencies.Common.SharedPrefHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;
    public AppModule(Context context){
        this.context=context;
    }

    @Provides
    public SharedPrefHelper provideSharedPrefHelper(){
        return new SharedPrefHelper(context);
    }

    @Provides
    protected DBUtil provideDBUtil() {
        return new DBUtil(context, "v19");
    }


}


