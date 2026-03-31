package TUTORIAL;

public class Generics {
    public static void main (String [] args){
        //  Generics = A concept where you can write a Class, Interface, or method
        //              that is compatible with different data types.
        //              <T> type parameter (placeholder that gets replaced with a real type)
        //              <String> type argument (specifies the type)

        Box<Double> box = new Box<>();

        box.setItem(3.0);
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getPrice());
    }
}
