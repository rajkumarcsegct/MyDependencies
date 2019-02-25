package com.own.raj.mydependencies.Helper;

import android.content.Context;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Named;

public class DataHelper {

    String dbName;
    int version;

    Context context;
    public DataHelper(){
    }

    public  String getDate(){
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH);
        return sdf.format(cal.getTime());

    }
}
