package com.example.helenmiller.expandableviewlist;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> listHeader;
    HashMap<String, List<String>> listChild;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //add the data for the departments and courses
        listHeader = new ArrayList<String>();
        listChild = new HashMap<String, List<String>>();

        // Add the header data data
        listHeader.add("ComputerScience");
        listHeader.add("InformationTechnology");

        // Add the CS child data
        List<String> computerScience = new ArrayList<String>();
        computerScience.add("CSC110");
        computerScience.add("CSC201");
        computerScience.add("CSC215");

        //Add the IT child data
        List<String> informationTechnology = new ArrayList<String>();
        informationTechnology.add("ITP100");
        informationTechnology.add("ITP193");
        informationTechnology.add("ITP226");

        //Add to the listChild
        listChild.put(listHeader.get(0), computerScience);
        listChild.put(listHeader.get(1), informationTechnology);


        //referencing the ExpandableListView
        ExpandableListView expListView = (ExpandableListView) findViewById(R.id.elvTestView);


        //create the OnGroupClickListener for the ExpandableListView
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
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, 	int childPosition, long id) {
                return false;
            }
        });






    }
}
