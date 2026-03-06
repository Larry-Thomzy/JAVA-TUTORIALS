package TUTORIAL;

import java.util.Scanner;

public class runtimePolymorphism {
    public static void main (String [] args) {

        // Runtime polymorphism = When the method that gets executed is decided at runtime
//                                based on the actual type of the object.


        Scanner input = new Scanner(System.in);
        Animal3 animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = input.nextInt();

        if (choice == 1) {
            animal = new Dog3();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat3();
            animal.speak();
        }
    }
}
