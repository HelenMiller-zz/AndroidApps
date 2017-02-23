package com.example.helenmiller.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class IndividualActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_individual);

        final EditText individualIncomeEntered = ((EditText) findViewById(R.id.txtEnterIncome));

        Button button = (Button) findViewById(R.id.btnSubmit); // submit button
        button.setOnClickListener(new View.OnClickListener() {

            final TextView taxDue = ((TextView) findViewById(R.id.TaxDue));  // TextView which will show user what taxes they owe


            public void onClick(View v) {

                if (individualIncomeEntered.length() == 0) {
                    Toast.makeText(IndividualActivity.this, "You must enter an income", Toast.LENGTH_LONG).show();

                } else {

                    boolean takeDeduction;

                    final RadioButton isDeductionChecked = (RadioButton) findViewById(R.id.radioTakeDeduction);
                    if (isDeductionChecked.isChecked()) {
                        takeDeduction = true;
                    } else {
                        takeDeduction = false;
                    }

                    double incomeEntered = Double.parseDouble(individualIncomeEntered.getText().toString()); // parsing user input from String to int

                    DecimalFormat currency = new DecimalFormat("$###,###.00"); // creating currency object to format tax due

                    taxDue.setText(currency.format(TaxBrackets.getTaxBurden(incomeEntered, false, takeDeduction)));
                }
            }

        });
    }
}
