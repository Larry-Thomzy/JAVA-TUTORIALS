package SALIM;
import java.util.Scanner;
import java.util.Random;

public class randomClass {
    public static void main (String [] args){

        Random ram = new Random();

        int num1 = ram.nextInt(1,10);
        System.out.println(num1);

        Double num2 = ram.nextDouble(1,10);
        System.out.println(num2);

        Boolean bool = ram.nextBoolean();
        System.out.println(bool);
    }

}
