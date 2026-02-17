package TUTORIAL;

import java.util.Arrays;

public class arrays {
    public static  void  main (String [] args) {
        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *


        String[] fruits = {"apple", "orange", "banana", "coconut"};
        System.out.println(fruits); // this would return a memory address, because its a reference variable
        System.out.println(fruits[0]); // we access it through index/indices

        fruits[0] = "pineapple";

        System.out.println(fruits[0]);

        int numOFruits = fruits.length; // the length properties returns the number of values in an array

        System.out.println(numOFruits);

        System.out.println("====================");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("====================");

        Arrays.sort(fruits); // sort is an array method that arranges the values order alphabetically

        for (String fruit: fruits) {   // Enhanced for loop
            System.out.println(fruit);
        }

        Arrays.fill(fruits, "pineapple"); // fill method replaces all values in an array with a specific value

        for (String fruit: fruits) {
            System.out.println(fruit);
        }



    }
}
