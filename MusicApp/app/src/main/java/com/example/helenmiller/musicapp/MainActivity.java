package com.example.helenmiller.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> listGenres;
    HashMap<String, List<String>> listAlbums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add the data for the Genres and albums
        listGenres = new ArrayList<String>();
        listAlbums = new HashMap<String, List<String>>();

        // Add the header data data
        listGenres.add("Rock");
        listGenres.add("JamBands");

        // Add the Add the album names
        List<String> Rock = new ArrayList<String>();
        Rock.add("Dookie");
        Rock.add("American Idiot");
        Rock.add("Let it Be");
        Rock.add("Revolver");

        List<String> JamBands = new ArrayList<String>();
        JamBands.add("American Beauty");
        JamBands.add("Shakedown Street");
        JamBands.add("Rift");
        JamBands.add("Junta");


        listAlbums.put(listGenres.get(0), Rock);
        listAlbums.put(listGenres.get(1), JamBands);


        ExpandableListView expListView = (ExpandableListView) findViewById(R.id.lstViewGenres);

//creating the ExpandableListAdapter
        ExpandableListAdapter listAdapter = new ExpandableListAdapter(this, listGenres, listAlbums);

        //set the Adapter for the ExpandableListView to the listAdapter we created
        expListView.setAdapter(listAdapter);

        //create the OnGroupClickListener for the ExpandableListView
        //this listener waits for clicks of the outer list
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return false;
            }
        });

        //create the OnChildClickListener for the ExpandableListView
        //this listener waits for clicks of the inner list
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if(groupPosition==1 && childPosition==0)
                {
                    startActivity(new Intent(MainActivity.this, LaunchedActivity.class));
                }
                return true;
            }

        });












    }
}
