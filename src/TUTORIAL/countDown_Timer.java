package TUTORIAL;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countDown_Timer {
    public static void main (String [] args) {

        // Java COUNTDOWN TIMER PROGRAM

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds to countdown from: ");
        int response = input.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // (task, delay, period)
    }
}
