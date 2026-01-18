package TUTORIAL;
import java.util.Scanner;

public class tempConversion {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp = input.nextDouble();

        System.out.print("Convert to Celsius Or Fahrenheit? (C or F): ");
        unit = input.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 /9 ) + 32;

        System.out.printf("%.2f°%s", newTemp, unit);

        // 2:49:05
    }
}
