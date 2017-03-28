package com.example.helenmiller.musicapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by helenmiller on 3/27/17.
 */

class LaunchedActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
