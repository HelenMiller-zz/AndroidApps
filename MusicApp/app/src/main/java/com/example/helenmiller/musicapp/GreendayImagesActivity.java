
package com.example.helenmiller.musicapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GreendayImagesActivity extends AppCompatActivity {
    Integer[] greendayPhotos =
            {
                    R.drawable.greenday1, R.drawable.greenday2, R.drawable.greenday3, R.drawable.greenday4
            };

    ImageView largePicGD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greenday_images);

        GridView grid = (GridView) findViewById(R.id.gridViewPhotosGD);

        final ImageView largePic = (ImageView) findViewById(R.id.imgLargeGD);

        grid.setAdapter(new ImageAdapter(this));


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getBaseContext(), "The band all together!", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(greendayPhotos[position]);
                }
                else if (position == 1) {
                    Toast.makeText(getBaseContext(), "Billy Joe Armstrong, lead guitarist ", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(greendayPhotos[position]);
                }
                else if(position==2) {
                    Toast.makeText(getBaseContext(), "Mike Dirnt on bass!", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(greendayPhotos[position]);

                }
                else {
                    Toast.makeText(getBaseContext(), "Tre Cool on drums!", Toast.LENGTH_SHORT).show();
                    largePic.setImageResource(greendayPhotos[position]);
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
            return greendayPhotos.length;
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
            largePicGD = new ImageView(context);
            largePicGD.setImageResource(greendayPhotos[position]);
            largePicGD.setScaleType(ImageView.ScaleType.FIT_XY);
            largePicGD.setLayoutParams(new GridView.LayoutParams(400, 400));
            return largePicGD;
        }
    }

}
