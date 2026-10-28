package day13;

public class Employee {
    int empId=102;
    String empName;
    String job;

    void display(){
        System.out.println(empId+"  "+empName+"  "+job);
    }

    // method to set data to variables
    void setEmployeeData(int id, String name, String j){
        empId=id;
        empName=name;
        job=j;
    }
    // constructor
    Employee(int empId, String empName, String job){
        this.empId=empId;
        this.empName=empName;
        this.job=job;
    }


}
