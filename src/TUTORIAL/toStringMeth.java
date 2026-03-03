package TUTORIAL;

public class toStringMeth {
    public static void main (String [] args) {

        // .toString() = Method inherited from the Object class
        //          Used to return a string representation of an object
        //          By default, it returns a hash code as a unique identifier.
        //          It can be overridden to provide meaningful details


        Motor motor1 = new Motor("Ford", "Mustang", 2025, "Red");
        Motor motor2 = new Motor("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(motor1); // memory address

        System.out.println(motor1.color + " " + motor1.year + " " + motor1.make + " " + motor1.model);
        System.out.println(motor2);
    }

}
