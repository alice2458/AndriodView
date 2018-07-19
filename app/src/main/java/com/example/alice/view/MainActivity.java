package com.example.alice.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;

public class MainActivity extends Activity {

    private DatePicker myDp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDp = (DatePicker) findViewById(R.id.dt1);
        myDp.updateDate(1998,8,21);
    }
}
