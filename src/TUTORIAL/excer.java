package TUTORIAL;
import java.util.Scanner;

public class excer {
    public static void main (String [] args) {
        // Calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = input.nextDouble();

        System.out.print("Enter the height: ");
        height = input.nextDouble();


        area = width * height;

        System.out.println("The area is " + area + "cm²");


        input.close();
    }
}
