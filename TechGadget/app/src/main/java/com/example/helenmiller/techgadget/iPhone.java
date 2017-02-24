package com.example.helenmiller.techgadget;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_phone);


        Button buyiPhone = (Button) findViewById(R.id.btnIPhone); // submit button
        buyiPhone.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://apple.co/2lxqoTS")));
            }
        });

    }
}
