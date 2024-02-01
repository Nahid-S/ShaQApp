package com.example.sha;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class splash extends AppCompatActivity {


    TextView lash1;
    ImageView lash2;


    private static int Splash_timeout=6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lash1 = findViewById(R.id.tvsplash);
        lash2 = findViewById(R.id.tvsplash2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashintent=new Intent(splash.this,MainActivity.class);
                startActivity(splashintent);
                finish();
            }
        },Splash_timeout);
        Animation myanimation= AnimationUtils.loadAnimation(splash.this,R.anim.animation2);
        lash1.startAnimation(myanimation);

        Animation myanimation2= AnimationUtils.loadAnimation(splash.this,R.anim.animation1);
        lash2.startAnimation(myanimation2);

    }
}