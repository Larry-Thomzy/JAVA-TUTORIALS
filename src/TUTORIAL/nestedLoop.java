package TUTORIAL;

import java.util.Scanner;

public class nestedLoop {
    public static void main (String [] args) {
        // nested loop = a loop inside a loop
        //              Used often with matrices or DS&A   "Data Structure & Algorithm"


        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " ");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("-----MULTIPLICATION TABLE-------");

        Scanner input = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = input.nextInt();
        System.out.println();


        for (int x = rows; x <= columns; x++ ) {
            for (int y = 1; y <= 12; y++) {
                System.out.println(x + " x " + y + " = " + x * y);
            }
            System.out.println();
        }
    }
}
