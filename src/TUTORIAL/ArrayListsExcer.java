package TUTORIAL;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExcer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the # of food you would like: ");
        int numOfFood = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = input.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
    }
}
