package TUTORIAL;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SetAlarm {
    public static  void main (String [] args) {
        // JAVA ALARM CLOCK

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath ="C:\\Users\\LANRE\\IdeaProjects\\MyFirstProject\\src\\Doja Cat Paint The Town Red.wav";

            while (alarmTime == null){
                try{
                    System.out.print("Enter an alarm time (HH:MM:SS): ");
                    String inputTime = input.nextLine();

                    alarmTime = LocalTime.parse(inputTime, formatter);
                    System.out.println("Alarm set for " + alarmTime);
                }catch(DateTimeParseException e){
                    System.out.println("Invalid format. Please use HH:MM:SS");
                }
            }

            AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, input);
            Thread alarmThread = new Thread(alarmClock);
            alarmThread.start();

    }
}
