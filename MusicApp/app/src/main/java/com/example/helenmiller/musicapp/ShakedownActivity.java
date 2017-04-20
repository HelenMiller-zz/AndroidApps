package com.example.helenmiller.musicapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShakedownActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_album);

        int albumPosition = getIntent().getIntExtra("groupPosition", -1);
        int songPosition = getIntent().getIntExtra("childPosition", -1);
        //String title = getIntent().getStringExtra("Album Title");

        final List<String> songsShakedown = new ArrayList<String>();
        songsShakedown.add("Good Lovin");
        songsShakedown.add("France");
        songsShakedown.add("Shakedown Street");
        songsShakedown.add("Operator");
        songsShakedown.add("Serengetti");
        songsShakedown.add("Fire on the Mountain");
        songsShakedown.add("I Need a Miracle");
        songsShakedown.add("From the Heart of Me");
        songsShakedown.add("Stagger Lee");
        songsShakedown.add("All New Minglewood Blues");
        songsShakedown.add("If I Had the World to Give");

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_album, R.id.txtSongs, songsShakedown));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch(position){
            case 0:
                startActivity(new Intent(ShakedownActivity.this, GratefulDeadImagesActivity.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Shakedown-Street-Grateful-Dead/dp/B000002VCV")));
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                startActivity(new Intent(ShakedownActivity.this, GratefulDeadImagesActivity.class));
            default:
                break;
        }
    }
}

