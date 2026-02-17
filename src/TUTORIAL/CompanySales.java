package TUTORIAL;

public class CompanySales {
    /**
     * Calculates and displays:
     * 1. Total sales for each store (row sum)
     * 2. Grand total sales for the company
     */

    public static void calculateSalesTotals(double [] [] sales) {
        double grandTotal = 0;

        for (int i = 0; i < sales.length; i++ ) {
            double rowTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                rowTotal += sales[i][j];
            }

            System.out.printf("Total sales for store %d = %.2f\n ", (i + 1), rowTotal);
            grandTotal += rowTotal;
        }
        System.out.printf("Grand Total Sales for Company = %.2f\n",grandTotal);
    }

    public static void main (String [] args) {
        double [] [] sales = {
                {12000, 15000, 10000},
                {8000, 9500, 11000},
                {20000, 18000, 22000}
        };
        calculateSalesTotals(sales);
    }
}

//for (int j = 0; j < sales[0].length; j++) {
//      double monthTotal = 0;
//
//      for (int i = 0; i < sales.length; i++) {
//          monthTotal += sales[i][j];
//        }
//
//        System.out.printf("Total sales for month %d = %.2f\n" ,(j + 1), monthTotal);
// }

// This loop i commented is calculating the Company Total sales of each month, i don't know if its part of the question,
// you can add it the method above shaa,
