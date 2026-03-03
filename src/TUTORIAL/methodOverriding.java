package TUTORIAL;

public class methodOverriding {
    public static void main (String [] args) {
        // method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined
        //                     Allows for code reusability and give specific implementations

        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        Fish2 fish = new Fish2();

        dog.move();
        cat.move();
        fish.move();
    }
}
