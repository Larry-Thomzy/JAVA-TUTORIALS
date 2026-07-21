package TUTORIAL;

import java.util.Scanner;

public class enhancedSwitches {
    public static void main (String [] args) {
        // Enhanced switch = A replacement to many else if statements (JAVA 14 feature)
        //


        Scanner input = new Scanner(System.in);

        // Using If-else statments

        System.out.print("Enter the day of the week:");
        String day = input.nextLine();

        if (day.equals("Monday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Tuesday")) {
            System.out.println("It is a week day");
        }
        else if (day.equals("Wednesday")) {
            System.out.println("It is a week day");
        }
        else if (day.equals("Thursday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Friday")) {
            System.out.println("It is a week day");
        }
        else if (day.equals("Saturday")) {
            System.out.println("It is the weekend");
        }
        else if (day.equals("Sunday")) {
            System.out.println("It is the weekend");
        }
        else {
            System.out.println(day + " is not a day");
        }


        // Using Enhanced Switch
        System.out.print("Enter the day of the week:");
        String Day = input.nextLine();

        switch (Day.toLowerCase()){
            case "monday" -> System.out.println("It's a weekday 😩");
            case "tuesday" -> System.out.println("It's a weekday 😩");
            case "wednesday" -> System.out.println("It's a weekday 😩");
            case "thursday" -> System.out.println("It's a weekday 😩");
            case "friday" -> System.out.println("It's a weekday 😩");
            case "saturday" -> System.out.println("It's the weekend 🙂");
            case "sunday" -> System.out.println("It's the weekend 🙂");
            default -> System.out.println(Day + " is not a day");

        }

        // A shorter way of implementing this:

        switch (Day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It's a weekday 😩");
            case "Saturday", "Sunday" -> System.out.println("It's the weekend 😀");
            default -> System.out.println(Day + "is not a day");
        }
    }
}
