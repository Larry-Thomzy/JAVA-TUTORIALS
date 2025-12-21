package TUTORIAL;
import java.util.*;

public class conditionalStatements {
    public static void main (String [] args) {
        // CONDITIONAL STATEMENTS
        // If statement  = performs a block of code if its condition is true

        Scanner input = new Scanner(System.in);

        String name;
        int age;
        boolean is_Student;

        System.out.print("Enter your name:");
        name = input.nextLine();



        System.out.print("Enter your age: ");
        age = input.nextInt();


        System.out.print("Are you a student? (true/false): ");
        is_Student = input.nextBoolean();

        // Group 1

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name! 😡");
        }
        else {
            System.out.println("Hello " + name + "! 😀");
        }




        // Group 2
        if (age >= 65) {
            System.out.println("You are a Senior! 👴");
        }
        else if(age >= 18) {
            System.out.println("You are an adult! 👨🏿");
        }

        else if (age < 0) {
            System.out.println("You haven't been born yet! 😇");
        }
        else if (age == 0) {
            System.out.println("You are a baby! 👶🏿");
        }
        else {
            System.out.println("You are a minor! 🧒🏻");
        }



        // Group 3

        if (is_Student){
            System.out.println("You are a Student! 🧑🏾‍🎓");
        }
        else {
            System.out.println("You are NOT a Student 🙍🏾");
        }

        input.close();
    }
}
