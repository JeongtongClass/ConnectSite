package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Intent intent1;
    private final String packageName = "com.kakao.talk";
    private final String packageNames = "com.everytime.v2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent1 = this.getPackageManager().getLaunchIntentForPackage(packageName);
        ImageButton imageButtonss = (ImageButton) findViewById(R.id.kakaobtn);
        imageButtonss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(intent1);
            }
        });
        intent = this.getPackageManager().getLaunchIntentForPackage(packageNames);
        ImageButton imageButtons = (ImageButton) findViewById(R.id.everytimebtn);
        imageButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(intent);
            }
        });
    }
}