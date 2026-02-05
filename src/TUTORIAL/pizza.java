package TUTORIAL;

public class pizza {
    public static void main (String [] args) {
        String pizza = bakePizza("flat read");
        System.out.println(pizza);

        pizza = bakePizza("flat bread", "mozzarella");
        System.out.println(pizza);

        pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza (String bread, String cheese ) {
        return  cheese + " " + bread + " pizza";
    }

    static String bakePizza (String bread, String cheese, String topping ) {
        return topping + " " +  cheese + " " + bread + " pizza";
    }


}
