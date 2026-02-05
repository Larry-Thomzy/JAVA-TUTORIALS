package TUTORIAL;

public class overloadedMethods {
    public static void main (String[] args) {
        // Overloaded Methods = Methods that share the same name but different parameters
        // signature = name + parameters

        System.out.println(add(4,5));
        System.out.println(add(4,5, 6));
        System.out.println(add(2,4,5,6));

    }
    static double add (double a, double b) {
        return a + b;
    }

    static double add (double a, double b, double c) {
        return a + b + c;
    }
    static double add (double a, double b, double c, double d) {
        return a + b + c + d;
    }
    // Procced to class pizza
}
