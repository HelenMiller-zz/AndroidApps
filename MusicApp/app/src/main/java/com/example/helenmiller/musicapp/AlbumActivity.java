package com.example.helenmiller.musicapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class AlbumActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_album);

       //int albumPosition = getIntent().getIntExtra("groupPosition", -1);
        //int songPosition = getIntent().getIntExtra("childPosition", -1);
        //String title = getIntent().getStringExtra("Album Title");

        //list of Albums
        String[] albums =
                {
                        "Dookie", "American Idiot", "Let it Be", "Revolver", "American Beauty", "Shakedown Street", "Rift", "Junta"
                };
 /*
        //lists of Album Songs
        String[] songsDookie =
                {
                        "Burnout", "Welcome to Paradise", "Sassafras Roots", "In the End", "Having a Blast", "Pulling Teeth", "When I Come Around", "F.O.D. / All By Myself", "Chump", "Basket Case", "Coming Clean", "Long View", "She", "Emenius Sleepus"
                };

        String[] songsLetItBe =
                {
                        "Two of Us", "Dig a Pony", "Whatsername", "Across the Universe", "I Me Mine", "Dig It", "Let it Be", "Maggie Mae", "I've Got a Feeling", "One After 909", "The Long and Winding Road", "For You Blue", "Get Back"
                };

        String[] songsShakedownStreet =
                {
                        "Good Lovin", "France", "Shakedown Street", "Operator", "Serengetti", "Fire on the Mountain", "I Need a Miracle", "From the Heart of Me", "Stagger Lee", "All New Minglewood Blues", "If I Had the World to Give"
                };
        String[] songsRift =
                {
                        "Rift", "Fast Enough For You", "Maze", "Sparkle", "Horn", "The Wedge", "My Friend, My Friend", "Weigh", "All Things Reconsidered", "Mound", "It's Ice", "The Horse", "Silent in the Morning"
                };

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_album, R.id.listSongs, songsShakedownStreet ));

    }*/

    }
}
