package com.example.multigame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.multigame.R;
import com.example.multigame.utils.ActivityUtils;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivityUtils.launchActivity(SplashScreenActivity.this , CreatePlayerActivity.class);
            }
        },1000);
    }
}
