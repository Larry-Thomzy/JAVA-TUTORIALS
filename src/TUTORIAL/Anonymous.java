package TUTORIAL;

public class Anonymous {
    public static void main (String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                  Add custom behaviour without having to create a new class.
        //                  Often used for one time uses (TimerTask, Runnable, callbacks )

        Dog4 dog1 = new Dog4();
        Dog4 dog2 = new Dog4(){
          @Override
          void speak(){
              System.out.println("Scooby Doo says *Ruh roh*");
          }
        };




        dog1.speak();
        dog2.speak();





    }
}
