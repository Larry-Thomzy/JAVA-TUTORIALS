package TUTORIAL;

import java.util.Scanner;

public class whileLoop {
    public static void main (String [] args) {


        // while Loop = repeat some code forever while some conditions remain true

        Scanner input = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }

        System.out.println("Hello "+ name);


        // Sample II

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = input.next().toUpperCase();
        }

        System.out.println("You have quit the game");


        // Sample III

        int age = 0;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        while (age < 0) {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = input.nextInt();

        }
        System.out.println("You are " + age + " years " + "old");


        // Sample IV
        // Do-while loop

        int number = 0;

        do {
            System.out.print("Enter a number between 1-10: ");
            number = input.nextInt();
        }while (number < 1 || number > 10);

        System.out.println("You picked " + number);

    }
}
