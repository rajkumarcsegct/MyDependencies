package com.own.raj.mydependencies.Common;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

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
