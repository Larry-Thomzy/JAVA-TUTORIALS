package TUTORIAL;

import java.util.Scanner;

public class forLoop {
    public static void main(String [] args) throws InterruptedException {
        // FOR LOOP
        // EXECUTE SOME CODE A CERTAIN AMOUNT OF TIMES

        for(int i = 0; i < 10; i++) {  // try i+=2, i+=3
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many times you want to Loop: ");
        int max = input.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }


        // Another sample
        // CountDown
        System.out.println();
        System.out.println("COUNTDOWN");
        System.out.println();

        System.out.print("Enter How many seconds to countdown from?: ");
        int start = input.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR !!");


//        NOTE: Use a for loop when you want to do something a limited amount of times

        // This exception typically occurs when a thread running the method is interrupted while it is sleeping,
        // waiting, or otherwise paused in its execution
    }
}
