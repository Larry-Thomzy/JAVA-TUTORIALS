package TUTORIAL;

public class WrapperClasses {
    public static void main (String [] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                  to be used as objects. "Wrap them in an object"
        //                  Generally don't wrap primitive unless you need an object.
        //                  Allows use of Collections Framework and static Utility Methods.

        //int a = 123; // regular variable declaration


        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;


        // Unboxing
        int x = a;


        String g = Integer.toString(123);
        String k = Double.toString(3.14);
        String j = Character.toString('@');
        String q = Boolean.toString(false);


        String p = g + k + j + q;
        System.out.println(p);

        // 8:51:35

    }
}
