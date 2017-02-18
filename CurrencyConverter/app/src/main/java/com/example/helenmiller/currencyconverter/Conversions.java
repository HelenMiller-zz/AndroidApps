package com.example.helenmiller.currencyconverter;

import android.widget.RadioButton;
import android.widget.Toast;

import java.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by helenmiller on 2/17/17.
 */

public class Conversions
{

    static String convertCurrency (double usDollarsEntered, int countryId )
    {
        double conversionRatePeso = 20.3985;
        double conversionRateEuro = 0.936869;
        double conversionRateCanadian = 1.30610;

        double resultAmount = 0;

        DecimalFormat currency = new DecimalFormat("$###,###,###.00");

        if(countryId == 3)
        {
            resultAmount = usDollarsEntered * conversionRateCanadian;
        }

        if(countryId == 2)
        {
            resultAmount= usDollarsEntered * conversionRateEuro;
        }


        if(countryId == 1)
        {
            resultAmount = usDollarsEntered * conversionRatePeso;

        }

        return currency.format(resultAmount);

    }
}