
package com.example.helenmiller.weddingphotography;

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


public class MainActivity extends AppCompatActivity {
    Integer[] WedPhotos =
            {
                    R.drawable.wed1, R.drawable.wed2, R.drawable.wed3, R.drawable.wed4,
                    R.drawable.wed5, R.drawable.wed6, R.drawable.wed7, R.drawable.wed8,
                    R.drawable.wed9, R.drawable.wed10
            };
    ImageView pic;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid = (GridView) findViewById(R.id.gridViewPhotos);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);

        grid.setAdapter(new ImageAdapter(this));


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getBaseContext(), "Contact us at anthology@wed.com", Toast.LENGTH_SHORT).show();
                pic.setImageResource(WedPhotos[position]);


            }
        });


    }

    public class ImageAdapter extends BaseAdapter

    {
        private Context context;


        public ImageAdapter(Context c)
        {
            context = c;
        }

        @Override
        public int getCount()
        {
            return WedPhotos.length;
        }

        @Override
        public Object getItem(int position)
        {
            return null;

        }

        @Override
        public long getItemId(int position)
        {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            pic = new ImageView(context);
            pic.setImageResource(WedPhotos[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));
            return pic;
        }
    }

}
