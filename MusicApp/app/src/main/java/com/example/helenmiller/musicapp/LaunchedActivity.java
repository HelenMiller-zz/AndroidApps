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
        //setContentView(R.layout.activity_bands);
        int groupPosition = getIntent().getIntExtra("groupPosition", -1);
        int childPosition = getIntent().getIntExtra("childPosition", -1);
        String title = getIntent().getStringExtra("Album Title");

        //put list of Albums

    }
}
