package TUTORIAL;

public class Getter_Setter {
    public static void main (String [] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITABLE.

        Car4 car = new Car4("Charger", "Yellow", 10000);

        System.out.println(car.color + " " + car.model + " " + car.price);

        // The attributes are public which means we can change them easily

        car.model = "Corvette";

        // 8:21:34
    }
}
