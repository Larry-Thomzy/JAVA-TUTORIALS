package TUTORIAL;
import java.util.Scanner;

public class mathexcer2 {
    public static void main (String [] args){

        // circumference = 2 * MATH.PI * radius
        // area = Math.PI * Math.pow(radius,2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner input = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The Circumference is " + circumference + "cm");
        System.out.println("The area is " + area + "cm²");
        System.out.println("The volume is " + volume + "cm³");

        // Using the printf method

        System.out.println();

        System.out.printf("The Circumference is: %.2fcm\n" , circumference);
        System.out.printf("The area is: %.1fcm²\n" , area );
        System.out.printf("The volume is: %.1fcm³\n" , volume);

        // with this we can specify how many digits after the decimal point





        input.close();
    }
}
