package TUTORIAL;

public class theMathClass {
    public static  void main (String [] args) {

        // Math is an inbuilt class that contains methods and constants for performing mathematical operations
        //

        System.out.println(Math.PI); // pi
        System.out.println(Math.E);  // exponential

        double result;

        result = Math.pow(2, 3); // power
        result = Math.abs(-5); // absolute
        result = Math.sqrt(49); // square root
        result = Math.round(3.14); // rounding off numbers
        result = Math.ceil(3.14); // rounding up numbers
        result = Math.floor(3.99); // round down numbers
        result = Math.max(12, 19); // maximum of both numbers
        result = Math.min(10, 20); // minimum of both numbers


        System.out.println(result);


    }
}
