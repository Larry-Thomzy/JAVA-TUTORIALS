package TUTORIAL;

public class OverloadedConstructor {
    public static void main (String [] args ) {
        // overloaded constructors = Allows  class to have multiple constructors
        //                          with different parameter lists.
        //                          Enable objects to be initialized in various ways.


        User user1 = new User("Larry");
        User user2 = new User("Larry", "larrythomzy@gmail.com");
        User user3 = new User ("Larry", "larrythomzy@gmail.com", 21);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println();

    }
}
