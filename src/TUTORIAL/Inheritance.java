package TUTORIAL;

public class Inheritance {
    public static void main(String [] args) {
        // Inheritance = One class inherits the attributes and methods
        //              from another class
        //              Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();


        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println();

        dog.speak();
        cat.speak();

        plant.photosynthesize();

    }
}
