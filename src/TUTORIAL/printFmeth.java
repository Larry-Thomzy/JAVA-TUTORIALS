package TUTORIAL;

public class printFmeth {
    public static void main (String args [] ) {
        // printf() = is a method used to format output

        // %[flags][width[.precision][specifier-character]

        // % -- The Placeholder
        // %s -- lowercase "s" for string datatype
        // %c -- lowercase "c" for character(single)
        // %d -- lowercase "d" for int
        // %f -- lowercase "f" for floating point or double
        // %b -- lowercase "b" for boolean
        // With the print f statement we have to manually input our newline character

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.println();

        // We can insert two variables


        System.out.printf("%s is %d years old\n", name, age);

        System.out.println();


        // PRECISION
        // We can limit the amount of digits that display after a decimal
        // by default displays three digits after the decimal place

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);


        // [FLAGS]
        // +  = output a plus
        // ,  = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price4 = 9000.99;
        double price5 = 10000.15;
        double price6 = -54000.01;



        System.out.println();
        System.out.printf("%+.2f\n", price3);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price1);

        // at any thousand's place we have a comma grouping separator
        System.out.println();
        System.out.printf("%,.2f\n", price4);
        System.out.printf("%,.2f\n", price5);
        System.out.printf("%,.2f\n", price6);


        // by adding a left parenthesis any negative numbers are enclosed in a set of parenthesis

        System.out.println();
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);


        // using a space character any positive numbers are preceded with a space


        System.out.println();
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);


        // [WIDTH]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println();
        // by adding a zero after the percent sign we can zero pad some of these
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.println();

        // by setting a positive number we can right justify these variables

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        // by setting a negative number we can left justify these variables

        System.out.println();
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}
