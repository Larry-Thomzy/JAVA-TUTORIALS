package TUTORIAL;

public class stringMethods {
    public  static  void main (String [] args) {
        String name = "Larry Thomzy";

        int length = name.length(); // length method: returns the number of characters in a string
        char letter = name.charAt(0); // charAt method: returns the character at a  particular index
        int index = name.indexOf("o"); // indexOf method: returns the index of a particular character
        int lastIndex = name.lastIndexOf("r"); // lastIndexOf Method: returns the index of the last occur of a particular character

        String upperName = name.toUpperCase(); // toUpperCase: converts to uppercase
        String lowerName = name.toLowerCase(); // toLowerCase: converts to lowercase
        String trimName = name.trim(); // trim: removes space before and after a string
        String replaceName = name.replace("o", "a");  // .replace(a, b): replace a with be

        Boolean empty = name.isEmpty(); // .isEmpty: returns a boolean after checking if a string is empty

        System.out.println(empty);

        if(name.isEmpty()) {
            System.out.println("Your name is Empty");
        }
        else {
            System.out.printf("Hello %s", name);
        }

        // .contains: also returns a boolean (it checks if a string contains any specific character)

        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesn't contain any spaces");
        }

        // There is a method to check if two strings are equal
        // .equals

        if(name.equals("password")) {
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

        // .equals doesn't account for case  sensitivity
        // we use the .equalsIgnoreCase

        if(name.equalsIgnoreCase("Password")) {
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

    }
}
