package com.example.alice.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TimePicker;

public class MainActivity extends Activity {

    private TimePicker myTp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTp = (TimePicker) findViewById(R.id.tp1);
        myTp.setIs24HourView(true);
        myTp.setCurrentHour(18);
        myTp.setCurrentMinute(30);
    }
}
