package com.example.helenmiller.techgadget;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest);

        Button buyNest = (Button) findViewById(R.id.btnNest); // submit button
        buyNest.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bestbuy.com/site/nest-learning-thermostat-3rd-generation-stainless-steel/4346501.p?skuId=4346501&ref=30&loc=KW-4338&ksid=3b070119-63d1-db29-d323-00006233db2d&ksprof_id=401&ksaffcode=491253&ksdevice=c&gclid=CjwKEAiArbrFBRDL4Oiz97GP2nISJAAmJMFaNiVzoB1uvErnlOVL8vu5AVwYkFqwX-K2YJWGq1rSsBoCk6bw_wcB")));

            }
        });

    }
}
