package com.example.helenmiller.taxcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Boolean isMarried = true;

        final Spinner isMarried = (Spinner)findViewById(R.id.married);

        Button button = (Button) findViewById(R.id.btnSubmit);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                final String spinnerSelection = isMarried.getSelectedItem().toString();

                if (spinnerSelection.equals("Yes"))
                {
                    startActivity(new Intent(MainActivity.this, MarriedActivity.class));
                }
                else {
                    startActivity(new Intent(MainActivity.this, IndividualActivity.class));

                }

            }
        });
    }
}
