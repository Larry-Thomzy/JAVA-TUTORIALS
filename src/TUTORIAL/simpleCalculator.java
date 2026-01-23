package TUTORIAL;

import java.util.Scanner;

public class simpleCalculator {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validateOperator = true;

        System.out.print("Enter the First number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an Operator (+, -, *, /, ^ ) : ");
        operator = input.next().charAt(0);

        System.out.print("Enter the Second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num1 == 0){
                    System.out.println("Cannot divide Zero!");
                    validateOperator = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!");
                validateOperator = false;
            }
        }


        if (validateOperator) {
            System.out.println("= " + result);
        }


    }
}
