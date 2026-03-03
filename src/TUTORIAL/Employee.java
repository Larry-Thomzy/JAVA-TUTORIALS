package TUTORIAL;

public class Employee extends Person{
    int Salary;

    Employee(String first, String last, int Salary){
        super(first, last);
        this.Salary = Salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.Salary);
    }
}
