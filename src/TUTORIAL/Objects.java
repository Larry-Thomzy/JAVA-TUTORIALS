package TUTORIAL;

import java.util.Scanner;

public class Objects {
    public static void main (String[] args) {
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();

        System.out.println(car); // memory address

        System.out.println(car.model);
        System.out.println(car.brand);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);


        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);


        car.drive();
        car.brake();


        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.brand + " " + car1.model);
        System.out.println(car2.brand + " " + car2.model);



    }
}
