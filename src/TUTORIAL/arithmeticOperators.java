package TUTORIAL;
import java.util.Scanner;

public class arithmeticOperators {
    public static void main (String [] args) {
        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        // z = x - y;
        // z = x * y;
        // Z = X / Y;
        // Z = X % Y;


        System.out.println(z);

        // Argumented Assignment Operators
        x = x + y;

        System.out.println(x);

        // OR

        // x += y;
        // x -=y;
        // x *=y;
        // x /=y;
        // x %=y;

        System.out.println(x);

        // Increment and Decrement Operators
        int d = 1;
        // d += 1;
        // d++;
        // d++;

        // d--;
        // d--;
        // d--;

        System.out.println(d);


        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // parenthesis exponents multipliaction divison addition subtraction
        // please excuse my dear aunty sally "A phrase used to remember"

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);



    }
}
