package TUTORIAL;

import java.util.Scanner;

public class arrays2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
//
//        String[] foods = {};
//
//        foods[0] = "pizza";

//        String [] foods = new String [3];
//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "hamburger";

        System.out.print("How many food do you want to buy?: ");
        int size = input.nextInt();
        input.nextLine();
        String [] foods = new String [size];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = input.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }


        System.out.println(foods.length);


    }
}
