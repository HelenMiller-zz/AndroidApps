package com.example.helenmiller.techgadget;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] gadgets =
                {
                        "Fit Bit", "Alexa", "iPhone", "Surface Pro", "Nest"
                };

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.tech, gadgets));


    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, FitBit.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, Alexa.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, iPhone.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Surface.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Nest.class));
                break;
            default:
                break;
        }

    }


}
