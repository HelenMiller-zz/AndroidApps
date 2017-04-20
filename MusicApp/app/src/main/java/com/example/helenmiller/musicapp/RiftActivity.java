package com.example.helenmiller.musicapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class RiftActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_rift);

        String[] songsRift =
                {
                        "Rift", "Fast Enough For You", "Maze", "Sparkle", "Horn", "The Wedge", "My Friend, My Friend", "Weigh", "All Things Reconsidered", "Mound", "It's Ice", "The Horse", "Silent in the Morning"
                };

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_rift, R.id.txtSongsRift, songsRift));
    }
}
