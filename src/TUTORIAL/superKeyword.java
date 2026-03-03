package TUTORIAL;

public class superKeyword {
    public static void main (String [] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         calls the parent constructor to initialize attributes


        Person person = new Person("Tom", "Cruise");
        Student2 student = new Student2("Harry", "Potter", 4.45);
        Employee employee = new Employee("Tom", "Bradey", 50000);


        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();
    }
}
