package com.example.basdatpbl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Set timer for splash screen timeout
        int timeout = 1500; // make the activity visible for 1.5 seconds
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                finish();
                Intent homepage = new Intent(SplashScreen.this, BottomActivity.class);
                startActivity(homepage);
            }
        }, timeout);
    }
}
