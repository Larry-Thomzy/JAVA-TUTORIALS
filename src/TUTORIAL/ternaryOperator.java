package TUTORIAL;

public class ternaryOperator {
    public static void main (String [] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 55;

        if (score >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }


        // TERNARY - OPERATION

        String passOrFail = (score >= 60) ? "PASS": "FAIL";
        System.out.println(passOrFail);


        // even or odd checker

        int number = 8;

        String evenOrOdd = (number % 2 == 0) ? "EVEN": "ODD";
        System.out.println(evenOrOdd);



        // Time of The Day Checker
        int hours = 13;

        String timeOfDay = (hours > 12) ? "P.M." : "A.M.";
        System.out.println(timeOfDay);



        // Tax rate Generator
        int income = 25000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
