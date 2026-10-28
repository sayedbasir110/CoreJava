package day13;

public class EmployeeMain {
    static void main() {
        /*
        Employee john=new Employee();
        john.empId=101;
        john.empName="John";
        john.job="Sales person";
        john.display();

        Employee ali=new Employee();
        ali.setEmployeeData(102,"Ali","IT");
        ali.display();

        Employee maryam=new Employee();
        maryam.setEmployeeData(103,"Maryam","Student");
        maryam.display();
         */

        Employee john=new Employee(101,"john","sales person");
        john.display();


    }
}
