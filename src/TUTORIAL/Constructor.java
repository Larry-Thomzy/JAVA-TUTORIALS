package TUTORIAL;

public class Constructor {
    public static void main (String [] args) {
        // constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values

        Student student1 = new Student("Larry", 21, 4.5);
        Student student2 = new Student("Burundi", 17, 3.2);
        Student student3 = new Student("Collins", 17, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println();


        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        System.out.println();



        student1.study();
        student2.study();
        student3.study();




    }
}
