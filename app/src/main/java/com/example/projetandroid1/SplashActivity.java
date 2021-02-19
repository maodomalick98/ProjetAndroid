package com.example.projetandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class SplashActivity extends EpsiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                HomeActivity.displayActivity(com.example.projetandroid1.SplashActivity.this);
                finish();
            }
        },2000);
    }

}