package com.example.helenmiller.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class IndividualActivity extends AppCompatActivity {
    double finalTaxDue; // variable to hold final tax due amount
    double incomeEntered;  //  variable to hold the income the user enterd in the EditText


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);


        Button button = (Button) findViewById(R.id.btnSubmit); // submit button
        button.setOnClickListener(new View.OnClickListener() {

            final TextView taxDue = ((TextView) findViewById(R.id.TaxDue));  // TextView which will show user what taxes they owe


            public void onClick(View v) {
                final EditText individualIncomeEntered = ((EditText) findViewById(R.id.txtEnterIncome));

                incomeEntered = Double.parseDouble(individualIncomeEntered.getText().toString()); // parsing user input from String to int

                DecimalFormat currency = new DecimalFormat("$###,###.##"); // creating currency object to format tax due

                if (incomeEntered <= 9275) {
                    finalTaxDue = incomeEntered * .10;
                    taxDue.setText(currency.format(finalTaxDue));
                }
                else if ( incomeEntered > 9275 && incomeEntered <= 37650 )
                {
                    finalTaxDue = 927.5 + ((incomeEntered - 9275) * .15);
                    taxDue.setText(currency.format(finalTaxDue));
                    // sets the text on the taxDue TextView
                }
                else if ( incomeEntered > 37651 && incomeEntered <= 91150 )
                {
                    finalTaxDue = 5183.75 + ((incomeEntered-37650) * .25);
                    taxDue.setText(currency.format(finalTaxDue));
                }
                else if ( incomeEntered > 91151 && incomeEntered <= 190150 )
                {
                    finalTaxDue = 18558 + ((incomeEntered - 91150) * .28);
                    taxDue.setText(currency.format(finalTaxDue));
                }
                else if ( incomeEntered > 190151 && incomeEntered <= 413350 )
                {
                    finalTaxDue = 46278.75 + ((incomeEntered - 190150) * .33);
                    taxDue.setText(currency.format(finalTaxDue));
                }
                else if ( incomeEntered > 413351 && incomeEntered <= 415050)
                {
                    finalTaxDue = 119934.75 + ((incomeEntered - 413350) * .35);
                    taxDue.setText(currency.format(finalTaxDue));
                }
                else if ( incomeEntered > 415351)
                {
                    finalTaxDue = 120529.75 + ((incomeEntered - 415050) * .396);
                    taxDue.setText(currency.format(finalTaxDue));
                }

            }
        });
    }
}
