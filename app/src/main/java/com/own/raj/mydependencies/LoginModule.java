package com.own.raj.mydependencies;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public String  getDBNameee(){
        return "v19";
    }

    @Provides
    public int  getDBVerrrr(){
        return 19;
    }

    @Provides
    public ArrayList<Integer> getData(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        return list;
    }

}


