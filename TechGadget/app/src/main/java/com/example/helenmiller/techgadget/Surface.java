package com.example.helenmiller.techgadget;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Surface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface);

        Button buySurface = (Button) findViewById(R.id.btnSurface); // submit button
        buySurface.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/2eXFZJY")));

            }
        });
    }
}
