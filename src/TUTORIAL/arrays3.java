package TUTORIAL;

import java.util.Scanner;

public class arrays3 {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        int [] numbers = {1,9,2,8,3,5,4};
        String [] fruits = {"apple", "banana", "pineapple"};
        int target = 7;
        boolean isFound = false;


        System.out.print("Enter a fruit to search for: ");
        String targetFruit = input.nextLine();

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
//
//        if(!isFound){
//            System.out.println("Element not found in the array");
//
//        }

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(targetFruit)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }


        if(!isFound){
            System.out.println("Element not found in the array");

        }
    }
}
