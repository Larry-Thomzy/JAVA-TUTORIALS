package TUTORIAL;

public class main2 {
    public static void main (String [] args) {
        // VARIABLE = A container used to hold/represent data.
        // Primitive = Simple value stored directly in memory (stack)

        // Reference = Memory address (stack) that points to the heap


        // Primitive = Stores the real value itself
        // Reference = They store a reference (a link) to where the object lives in memory.

        //Primitive = i hold the value
        // Reference = i hold the address of the value




        // Primitive Vs Reference
        // ----------   ----------

        // Int          String
        //  Double      Array
        //  Char        Object
        //  boolean


        // 2 steps to creating a variable
        // ------------------------------

        // 1. Declaration
        // 2. Assignment

        int age = 21;
        int year = 2025;
        int quantity = 1;
        // int, short for integers: They are whole numbers e.g 1, 20, 4, 100, 102

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);
        System.out.println("The Year is " + year);


        // Double, are numbers but it can contain a decimal portion unlike ints e.g 0.1, 2.5, 2.45, 3.147

        double price = 19.99;
        double gpa = 3.5;
        double temperature = - 12.5;

        System.out.println("$" + price);
        System.out.println();


        // CHAR, short for characters are single character e.g 'A', '?', 'E'

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);


        // boolean is a true or false datatype just these two values (true/false)
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;


        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);
        System.out.println();


        // String is a series of characters e.g "bread", "Daniel", "run"
        String name = "Larry Thomzy";
        String food = "Semo & Vegetables";
        String email = "larrythomzy007@gmail.com";
        String car = "BMW";
        String color = "blue";


        System.out.println(name);
        System.out.println("Hello " + name);

        System.out.println("My Favourite food is " + food);

        System.out.println("Your email is " + email);
        System.out.println();

        System.out.println("------------FINALLY----------------");
        System.out.println("Hello " + name);
        System.out.println("You are " + age + "Years Old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Your average letter grade is " + grade);
        System.out.println();

        System.out.println("Your choice is a " + color + " " + year + " " + car);

        System.out.println("The Price is " + currency + price);

        if (forSale){
            System.out.println("There is a " + car + "for sale !!");
        }
        else {
            System.out.println("The " + car + "is not for sale !");
        }



    }
}
