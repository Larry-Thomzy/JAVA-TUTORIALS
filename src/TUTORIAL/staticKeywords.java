package TUTORIAL;

public class staticKeywords {
    public static void main(String [] args) {
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          commonly used for utility methods or shared resources.

        // proceed to friend

        Friend friend1 = new Friend("Caleb");
        Friend friend2 = new Friend("Faruk");
        Friend friend3 = new Friend("Onome");
        Friend friend4 = new Friend("Nifsee");



        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);


        // accessing the static variable by the class name
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

        Math.round(3.99); // round is an utility method (static method) from class "Math"


    }
}
