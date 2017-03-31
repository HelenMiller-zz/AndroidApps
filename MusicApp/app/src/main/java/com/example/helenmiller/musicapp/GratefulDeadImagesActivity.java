package com.example.helenmiller.musicapp;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class GratefulDeadImagesActivity extends AppCompatActivity {
    Integer[] deadPhotos =
            {
                    R.drawable.gd1, R.drawable.gd2, R.drawable.gd3, R.drawable.gd4
            };

            ImageView largePic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grateful_dead_images);

        GridView grid = (GridView) findViewById(R.id.gridViewPhotos);

        final ImageView largePic = (ImageView) findViewById(R.id.imgLarge);

        grid.setAdapter(new ImageAdapter(this));


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getBaseContext(), "Ladies and Gentleman, The Grateful Dead!", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(deadPhotos[position]);
                }
                else if (position == 1) {
                    Toast.makeText(getBaseContext(), "Jerry and Band playing Shakedown Street ", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(deadPhotos[position]);
                }
                else if(position==2) {
                    Toast.makeText(getBaseContext(), "Steal Your Face ", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(deadPhotos[position]);

                }
                else {
                    Toast.makeText(getBaseContext(), "Come Hear Uncle John's Band", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(deadPhotos[position]);
                }
            }
        });




    }

    public class ImageAdapter extends BaseAdapter
    {
        private Context context;
        public ImageAdapter(Context c) { context = c;}

        @Override
        public int getCount() {
            return deadPhotos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            largePic = new ImageView(context);
            largePic.setImageResource(deadPhotos[position]);
            largePic.setScaleType(ImageView.ScaleType.FIT_XY);
            largePic.setLayoutParams(new GridView.LayoutParams(400, 400));
            return largePic;
        }
    }

}
