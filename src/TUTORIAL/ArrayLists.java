package TUTORIAL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main (String [] args) {
        // ArrayList = A resizable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(3.14);
        list2.add(1.99);
        list2.add(2.01);

        System.out.println(list2);

        ArrayList<String>  fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Watermelon");

        System.out.println(fruits);

        fruits.remove(0);
        System.out.println(fruits);

        fruits.set(2, "Coconut");
        System.out.println(fruits);

        System.out.println(fruits.get(1));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);


        for (String fruit : fruits) {
            System.out.println(fruit);
        }




    }
}
