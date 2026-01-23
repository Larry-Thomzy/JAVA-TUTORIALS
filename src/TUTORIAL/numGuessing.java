package TUTORIAL;

import java.util.Random;
import java.util.Scanner;

public class numGuessing {
    public static void main (String [] args) {
        // Number Guessing Game

        Scanner input = new Scanner(System.in);
        Random ram = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = ram.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess  number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("TOO LOW! try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! try again");
            }else {
                System.out.println("CORRECT! the number was " + randomNumber);
                System.out.println("No of attempts: " + attempts);
            }

        }while (guess != randomNumber);
    }
}
