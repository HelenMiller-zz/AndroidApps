package com.example.helenmiller.musicapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

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



        //list of Albums
        String[] albums =
                {
                        "Dookie", "American Idiot", "Let it Be", "Revolver", "American Beauty", "Shakedown Street", "Rift", "Junta"
                };




        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_album, R.id.txtSongs, songsShakedown));


        //lists of Album Songs
        String[] songsDookie =
                {
                        "Burnout", "Welcome to Paradise", "Sassafras Roots", "In the End", "Having a Blast", "Pulling Teeth", "When I Come Around", "F.O.D. / All By Myself", "Chump", "Basket Case", "Coming Clean", "Long View", "She", "Emenius Sleepus"
                };

        String[] songsLetItBe =
                {
                        "Two of Us", "Dig a Pony", "Whatsername", "Across the Universe", "I Me Mine", "Dig It", "Let it Be", "Maggie Mae", "I've Got a Feeling", "One After 909", "The Long and Winding Road", "For You Blue", "Get Back"
                };


        String[] songsRift =
                {
                        "Rift", "Fast Enough For You", "Maze", "Sparkle", "Horn", "The Wedge", "My Friend, My Friend", "Weigh", "All Things Reconsidered", "Mound", "It's Ice", "The Horse", "Silent in the Morning"
                };
    }

}

