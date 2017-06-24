package com.example.administrator.firstproject;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * Created by Administrator on 2017/6/24.
 */

public class SpeechApp extends Application {
    @Override
    public void onCreate() {
        SpeechUtility.createUtility(SpeechApp.this, "appid=" + getString(R.string.app_id));
        super.onCreate();

    }
}
