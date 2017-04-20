package com.example.helenmiller.musicapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class LetItBeActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_letitbe);

        String[] songsLetItBe =
                {
                        "Two of Us", "Dig a Pony", "Whatsername", "Across the Universe", "I Me Mine", "Dig It", "Let it Be", "Maggie Mae", "I've Got a Feeling", "One After 909", "The Long and Winding Road", "For You Blue", "Get Back"
                };

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_letitbe, R.id.txtSongsLetItBe, songsLetItBe));

    }
}
