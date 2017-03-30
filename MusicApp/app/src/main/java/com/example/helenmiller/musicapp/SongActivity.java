package com.example.helenmiller.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);


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

    }
}
