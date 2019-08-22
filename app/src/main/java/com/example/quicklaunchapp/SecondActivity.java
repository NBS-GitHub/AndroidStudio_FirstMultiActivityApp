package com.example.quicklaunchapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("org.frontEpic.QuickLaunchApp.MESSAGE")){
            TextView tv = (TextView) findViewById(R.id.textView);
            String message = getIntent().getExtras().getString("org.frontEpic.QuickLaunchApp.MESSAGE");
            tv.setText(message);
        }

    }
}
