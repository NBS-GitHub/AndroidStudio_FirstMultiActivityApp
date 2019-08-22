package com.example.quicklaunchapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        Button frontEpicBtn = (Button) findViewById(R.id.frontEpicBtn);

        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSecondActivity = new Intent(getApplicationContext(), SecondActivity.class);
                goToSecondActivity.putExtra("org.frontEpic.QuickLaunchApp.MESSAGE", "HELLO WORLD");
                startActivity(goToSecondActivity);
            }
        });

        frontEpicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri address = Uri.parse("https://www.frontepic.com");

                Intent goToFrontEpic = new Intent(Intent.ACTION_VIEW, address);
                if(goToFrontEpic.resolveActivity(getPackageManager()) != null)
                    startActivity(goToFrontEpic);

            }
        });

    }
}
