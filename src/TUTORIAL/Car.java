package TUTORIAL;

public class Car {
    String brand = "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the engine");
    }

    void drive () {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }


}
