package com.own.raj.mydependencies;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.SupportActivity;

import com.own.raj.mydependencies.Helper.DataHelper;

public class MyActivity extends SupportActivity {

    DataHelper dataHelper;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myactivity);

        dataHelper=new DataHelper();
        dataHelper.getDBName();
    }
}
