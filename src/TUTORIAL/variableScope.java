package TUTORIAL;

public class variableScope {

    static int x = 3; // CLASS

    public static void main (String [] args) {

        // Variable scope  = where a variable can be accessed

        //int x = 1; // Local
        System.out.println(x);

        doSomething();

    }

    static void doSomething() {
        //int x = 2; // Local
        System.out.println(x);
    }

}
