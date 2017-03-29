package com.example.helenmiller.musicapp;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by helenmiller on 3/27/17.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter
{
    private Context context;
    private List<String> listGenres; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> listAlbums;

    public ExpandableListAdapter(Context context, List<String> listGenres,
                                 HashMap<String, List<String>> listAlbums) {
        this.context = context;
        this.listGenres = listGenres;
        this.listAlbums = listAlbums;
    }

    @Override
    public int getGroupCount() {
        return this.listGenres.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listAlbums.get(this.listGenres.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listGenres.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.listAlbums.get(this.listGenres.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater Inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = Inflater.inflate(R.layout.activity_bands, null);

        }
        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblBandName);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.activity_list_song, null);
        }

        TextView txtListChild = (TextView) convertView.findViewById(R.id.lblSongName);

        txtListChild.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
