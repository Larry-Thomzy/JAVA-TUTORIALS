package TUTORIAL;
import java.util.Scanner;
import java.util.Random;

public class randomClass {
    public static void main (String args []) {

        Random ram = new Random();

        int number1;
        int number2;
        int number3;
        double num;
        boolean isHeads;

        number1 = ram.nextInt(1, 7); // first number is inclusive but the second number is exclusive
        number2 = ram.nextInt(1, 7);
        number3 = ram.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        // Double
        num = ram.nextDouble();

        System.out.println(num);

        // Boolean
        isHeads = ram.nextBoolean();
        System.out.println(isHeads);

        if (isHeads) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
