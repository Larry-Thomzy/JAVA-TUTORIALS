package TUTORIAL;

public class two_dimensional_array {
    public static void main (String [] args) {
        // 2D array = An array where each element is an array
//                useful for storing a matrix of data

        String [] fruits = {"apple", "banana", "orange"};
        String [] vegetables = {"potato", "onion", "carrot"};
        String [] meats = {"chicken", "pork", "beef", "fish"};

        String [] [] groceries = {fruits, vegetables, meats};
        String [] [] groceries2 = {
                {"apple", "banana", "orange"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}
        };

        groceries2 [0][0] = "pineapple"; // changing the "apple" to "pineapple"
        groceries2 [1][2] = "celery"; // changing the "carrot" to "celery"
        groceries2 [2][1] = "eggs"; //  changing the "pork" to "eggs"

        


        for (String [] foods : groceries) {
            System.out.println(foods); // memory address
        }
        System.out.println();

        for (String [] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
