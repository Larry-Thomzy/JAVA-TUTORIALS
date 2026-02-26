package TUTORIAL;

public class arrayObjects {

    public static void main (String args []) {
        Truck truck1 = new Truck("Toyota Tacoma", "Black");
        Truck truck2 = new Truck("Toyota Hilux", "White");
        Truck truck3 = new Truck("Toyota Tundra", "Black");

//    Truck[] trucks = new Truck[3];

        Truck[] trucks = {truck1, truck2, truck3};

        for (Truck truck : trucks) {
                truck.drive();

        }
    }

}
