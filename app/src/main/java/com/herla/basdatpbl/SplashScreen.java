package com.herla.basdatpbl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

//    ImageView imageView1, imageView2;
//    TextView textView1, textView2;
//
//    Animation fade_animation = AnimationUtils.loadAnimation(this, R.anim.fade_animation);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        imageView1 = findViewById(R.id.logoapp);
//        imageView2 = findViewById(R.id.logoum);
//        textView1 = findViewById(R.id.appname);
//        textView2 = findViewById(R.id.instance);
//
//        imageView1.setAnimation(fade_animation);
        //Set timer for splash screen timeout
        int timeout = 3000; // make the activity visible for 3 seconds
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                Intent homepage = new Intent(SplashScreen.this, BottomActivity.class);
                startActivity(homepage);
                finish();
            }
        }, timeout);
    }
}
