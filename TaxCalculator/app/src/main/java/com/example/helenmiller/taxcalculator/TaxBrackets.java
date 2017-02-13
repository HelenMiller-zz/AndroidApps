package com.example.helenmiller.taxcalculator;



public class TaxBrackets {

    public static double getTaxBurden(double incomeEntered, boolean isMarried) {

        double taxDue = 0;

        final double taxDataIndividual[][] = {
                // Tax Bracket cutoff
                {9275, 37650, 91150, 190150, 413350, 415050, 415351},
                // Tax Rate
                {0.10, 0.15, 0.25, 0.28, 0.33, 0.35, 0.396},
                // Minimum Tax
                {0, 927.5, 5183.75, 18558, 46278.75, 119934.75, 120529.75}
        };

        final double taxDataMarried[][] = {
                // Tax Bracket cutoff
                {18550, 75300, 151900, 231450, 413350, 466950, 466951},
                // Tax Rate
                {0.10, 0.15, 0.25, 0.28, 0.33, 0.35, 0.396},
                // Minimum Tax
                {0, 18550, 75300, 151900, 231450, 413350, 466950}
        };

        if (isMarried == true)
            incomeEntered = incomeEntered - 12600 ;
        else
            incomeEntered = incomeEntered - 6300;
        double taxData[][];

        if (isMarried == true)
            taxData = taxDataMarried;
        else
            taxData = taxDataIndividual;

        for (int i = 0; i < 7; i++) {
            if (incomeEntered <= taxData[0][i]) {
                taxDue = incomeEntered * taxData[1][i] + taxData[2][i];
                break;
            }
        }
        return taxDue;
    }
}



            /*

                if (incomeEntered <= 9275) {
                    taxDue = incomeEntered * .10;
                }
                else if (incomeEntered <= 37650)
                {
                    taxDue = 927.5 + (incomeEntered - 9275) * .15;
                }
                else if (incomeEntered <= 91150)
                {
                    taxDue = 5183.75 + (incomeEntered-37650) * .25;
                }
                else if (incomeEntered <= 190150)
                {
                    taxDue = 18558 + (incomeEntered - 91150) * .28;
                }
                else if (incomeEntered <= 413350)
                {
                    taxDue = 46278.75 + (incomeEntered - 190150) * .33;
                }
                else if (incomeEntered <= 415050)
                {
                    taxDue = 119934.75 + (incomeEntered - 413350) * .35;
                }
                else //if ( incomeEntered > 415351)
                {
                    taxDue = 120529.75 + (incomeEntered - 415050) * .396;
                }

                return taxDue;*/

