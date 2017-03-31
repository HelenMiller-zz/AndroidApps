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
        listGenres.add("Jam Bands");

        // Add the Add the album names
        final List<String> rock = new ArrayList<String>();
        rock.add("Dookie");
        rock.add("Let it Be");

        final List<String> jamBands = new ArrayList<String>();
        jamBands.add("Shakedown Street");
        jamBands.add("Rift");


        listAlbums.put(listGenres.get(0), rock);
        listAlbums.put(listGenres.get(1), jamBands);

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
                    Intent i = new Intent(MainActivity.this, ShakedownActivity.class);
                    /*i.putExtra("groupPosition", groupPosition);
                    i.putExtra("childPosition", childPosition);*/
                   /* if (groupPosition == 0){
                        String title = rock.get(childPosition);
                        i.putExtra("Album Title", title);
                    }
                    else {
                        String title = jamBands.get(childPosition);
                        i.putExtra("Album Title", title);
                    }*/
                   startActivity(i);
                }
                return true;
            }

        });
    }
}
