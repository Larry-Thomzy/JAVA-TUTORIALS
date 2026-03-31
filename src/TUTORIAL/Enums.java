package TUTORIAL;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = input.nextLine().toUpperCase();

//        Day day = Day.SUNDAY;
//        System.out.println(day);
//        System.out.println(day.getDayNumber());
        try {
            Day day = Day.valueOf(response);
            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");

            }
        }catch (IllegalArgumentException e){
            System.out.println("Please enter a valid date");
        }
    }
}
