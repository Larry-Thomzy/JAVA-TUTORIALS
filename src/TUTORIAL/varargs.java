package TUTORIAL;

public class varargs {
    public static void main (String [] args) {
        // varargs = allow a method to accept a varying number of arguments
//            makes methods more flexible, no need for overloaded methods
//            java will pack the arguments into an array
//            ...(ellipsis)


        System.out.println(add(1,2,3,4,5));
        System.out.println(average(1,2,3,4,5));


    }

//    static double add (int a, int b) {
//        return a + b;
//    }

//    static double add (int a, int b, int c) {
//        return a + b + c;
//    }

//    static double add (int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

//    static double add (int a, int b, int c, int d, int e) {
//        return a + b + c + d + e;
//    }

//    static double add (int a, int b, int c, int d, int e, int f) {
//        return a + b + c + d + e + f;
//    }

//    static double add (int a, int b, int c, int d, int e, int f, int g) {
//        return a + b + c + d + e + f + g;
//    }

    static int add (int... numbers) {
//        System.out.println(numbers); -- memory address
        int sum = 0;
 
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double...numbers) {

        double sum = 0;

        if(numbers.length
                == 0) {
            return 0;
        }

        for(double number: numbers) {
            sum += number;
        }

        return  sum / numbers.length;
    }

}

// basically the java compiler is packing all these arguments into an array when we send them to a method then we work with the array.
