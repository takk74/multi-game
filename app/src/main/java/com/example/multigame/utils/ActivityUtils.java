package com.example.multigame.utils;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.multigame.R;
import com.example.multigame.activity.CreatePlayerActivity;
import com.example.multigame.activity.SplashScreenActivity;

public class ActivityUtils  {

    public static void launchActivity(AppCompatActivity activity , Class activityClass) {
        launchActivity(activity, activityClass, false);
    }
    public static void launchActivity(AppCompatActivity activity , Class activityClass, boolean isFinish) {
        launchActivity(activity, new Intent(activity, activityClass), isFinish);
    }

    public static void launchActivity(AppCompatActivity activity , Intent intent) {
        launchActivity(activity, intent, true);
    }

    public static void launchActivity(AppCompatActivity activity ,Intent intent, boolean isFinish) {
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_to_right , R.anim.fade_out);
        if(isFinish) {
            activity.finish();
        }

    }
}
