package TUTORIAL;
import java.util.*;

public class weightConversion {
    public static void main (String [] args) {
        // WEIGHT CONVERSION PROGRAM

        // Declare a variable

        // Welcome Message

        // Prompt for user choice

        // option 1 convert lbs to kgs

        // option 2 convert kgs to lbs

        // else print not a valid choice


        Scanner input = new Scanner (System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");


        System.out.print("Choose an Option: ");

        choice = Integer.parseInt(input.nextLine());

        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The New Weight in kgs is:  %.2fkg", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kg: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The New Weight in lbs is: %.2flbs", newWeight);
        }
        else {
            System.out.println("That was not a valid choice !!");
        }


    }
}
