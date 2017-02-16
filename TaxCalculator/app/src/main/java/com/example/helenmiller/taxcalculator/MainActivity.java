package com.example.helenmiller.taxcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        testTaxAlgorithm();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner isMarried = (Spinner)findViewById(R.id.married);

        Button button = (Button) findViewById(R.id.btnSubmitM);
        button.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                final String spinnerSelection = isMarried.getSelectedItem().toString();

                if (spinnerSelection.equals("Yes"))
                {

                    startActivity(new Intent(MainActivity.this, MarriedActivity.class));
                }
                else {
                    startActivity(new Intent(MainActivity.this, IndividualActivity.class));

                }

            }
        });
    }

    void testTaxAlgorithm() {
        testTax(560000, true, true);
        testTax(0, true, true);
        testTax(19999909, true, true);
        testTax(23000, true, true);
        testTax(4500, true, true);
        testTax(9265, true, true);
        testTax(350000, true, true);
        // Test Married without Deduction
        Log.d("Tax Calc", "*******Test Married without Deduction");
        testTax(0, true, false);
        testTax(1, true, false);
        testTax(18550, true, false);
        testTax(18551, true, false);
        testTax(0, true, false);
        testTax(4600098, true, false);
        testTax(99999999, true, false);

        // Test Single without Deduction

    }

    void testTax(double income, boolean isMarried, boolean useDeduction)
    {
        double result;
        String message;

        result = TaxBrackets.getTaxBurden(income, isMarried, useDeduction);
        message = String.format("Income: %f Married: %s Use Deduction: %s Tax: %f",
                income, String.valueOf(isMarried), String.valueOf(useDeduction), result);
        Log.d("Tax Calc", message);

    }
}
