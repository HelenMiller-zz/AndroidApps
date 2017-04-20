package com.example.helenmiller.musicapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DookieActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] songsDookie =
                {
                        "Burnout", "Welcome to Paradise", "Sassafras Roots", "In the End", "Having a Blast", "Pulling Teeth",
                        "When I Come Around", "F.O.D. / All By Myself", "Chump", "Basket Case", "Coming Clean", "Long View", "She", "Emenius Sleepus"
                };

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_dookie, R.id.txtSongsDookie, songsDookie));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch(position){
            case 0:
                startActivity(new Intent(DookieActivity.this, GreendayImagesActivity.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Dookie-Green-Day/dp/B000002MP2")));
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
                startActivity(new Intent(DookieActivity.this, GreendayImagesActivity.class));
            default:
                break;
        }
    }
}
