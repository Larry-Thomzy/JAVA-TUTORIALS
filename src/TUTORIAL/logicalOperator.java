package TUTORIAL;

import java.util.Scanner;

public class logicalOperator {
    public static void main (String  [] args) {

        // LOGICAL OPERATORS
        //  && = AND
        //  || = OR
        //  !  = NOT

        double temp = 30;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The Weather is GOOD 😀");
            System.out.println("It is SUNNY outside 🌞");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The Weather is GOOD 😀");
            System.out.println("It is CLOUDY outside ☁️");
        }
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad 😩");
        }



        // EXAMPLES
        Scanner input = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your username: ");
        username = input.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } else {
            System.out.println("Welcome " + username + "!");
        }

    }
}
