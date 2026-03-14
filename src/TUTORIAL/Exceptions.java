package TUTORIAL;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        Scanner input = new Scanner(System.in);

       // System.out.println(1/0); // can't divide by zero (Arithmetic Exception Error)

        try{
            System.out.println(1/0);
        }
        catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO! ");
        }



        try{
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(number);
        }catch (InputMismatchException e) {
            System.out.println("This wasn't a number");
        }

        // we can use multiple catch at a GO

        try{
            System.out.println(45/5);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("This wasn't a number");
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero ");
        }


        // You can catch all exceptions by using Exception itself

        try {
            System.out.println(100 / 0);
        }
        catch (Exception e) {
            // SAFETY NET
            System.out.println("Something Went Wrong");
        }


//        finally {} This will always execute whether, there's an exception or not

        try {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(number);
        }catch (InputMismatchException e) {
            System.out.println("This wasn't a number");
        }
        finally {
            System.out.println("Exiting....");
            System.out.println("This always execute");
        }


    }
}
