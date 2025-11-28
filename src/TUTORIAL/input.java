package TUTORIAL;
import java.util.Scanner;

public class input {
    public static void main (String [] args) {
        // Scanner: Is an object that allows us to accept user input in java
        // To use a scanner we have to import it from a certain package utilities or util
        // Scanner is a class from the Package Util
        // Now we create a scanner object

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // nextLine method reads a string of characters including any spaces
        System.out.println("Hello " + name);
        System.out.println();


        System.out.print("Enter pet name: ");
        String petName = scanner.next(); // next method doesn't read any spaces
        System.out.println(petName + " is adorable !!");
        System.out.println();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // nextInt reads integer data's only
        System.out.println("You are " + age + " years old");
        System.out.println();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble(); // nextDouble reads Double datatype
        System.out.println("Your gpa is: " + gpa);
        System.out.println();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // nextBoolean reads Boolean datatypes true/false
        System.out.println("Student: " + isStudent);
        System.out.println();


        if(isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled as a student");
        }

        System.out.println();


        // COMMON ISSUES

        System.out.print("Enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age2 + " years old");
        System.out.println("You like the color " + color );




        scanner.close();  // If you don't close your scanner it can lead to unexpected behaviour


    }
}
