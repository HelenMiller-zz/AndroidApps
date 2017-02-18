package com.example.helenmiller.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

   /* double conversionRatePeso = 20.3985;
    double conversionRateEuro = 0.936869;
    double conversionRateCanadian = 1.30610;*/

    String currencyType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final RadioButton euro = (RadioButton) findViewById(R.id.radEuro);
        final RadioButton peso = (RadioButton) findViewById(R.id.radPesos);
        final RadioButton canada = (RadioButton) findViewById(R.id.radCanada);

        final EditText usDollarsEntered = (EditText) findViewById(R.id.txtEnterAmount);
        final TextView result = (TextView) findViewById(R.id.txtResult);

        Button convert = (Button) findViewById(R.id.btnConvert);
        convert.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                if (usDollarsEntered.length() == 0) {
                    Toast.makeText(MainActivity.this, "You must enter a dollar amount", Toast.LENGTH_LONG).show();

                } else {
                    double resultAmount = 0;
                    double amountEntered;
                    int countryId = 0;
                    String countryCurrency = "";


                    if (usDollarsEntered.getText().toString() == "") {
                        Toast.makeText(MainActivity.this, "You must enter an amount to convert", Toast.LENGTH_LONG).show();
                    }

                    amountEntered = Double.parseDouble(usDollarsEntered.getText().toString());

                    DecimalFormat currency = new DecimalFormat("$###,###,###.00");


                    if (amountEntered > 100000 || amountEntered < 0) {
                        Toast.makeText(MainActivity.this, "Amount must be less than $100,000.00", Toast.LENGTH_LONG).show();
                    } else {
                        if (peso.isChecked()) {
                            countryId = 1;
                            countryCurrency = " \nPesos";

                        } else if (euro.isChecked()) {
                            countryId = 2;
                            countryCurrency = " \nEuros";
                        } else {
                            countryId = 3;
                            countryCurrency = " \nCanadian Dollars";
                        }
                    }

                    //result.setText(currency.format(resultAmount) + currencyType);
                    result.setText(Conversions.convertCurrency(amountEntered, countryId) + countryCurrency);


                }
            }


        });
    }
}

/*
else
        {
        if(peso.isChecked())
        {
        resultAmount = amountEntered * conversionRatePeso;
        currencyType = " \n Pesos";

        }
        else if(euro.isChecked())
        {
        resultAmount= amountEntered * conversionRateEuro;
        currencyType = " \nEuros";
        }
        else
        {
        resultAmount = amountEntered * conversionRateCanadian;
        currencyType = " \nCanadian Dollars";
        }
        }*/