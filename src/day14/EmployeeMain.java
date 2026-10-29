package day14;

public class EmployeeMain {
    static void main() {
        Employee emp1=new Employee();
        emp1.setEmpId(2);
        System.out.println(emp1.getEmpId());
        emp1.setEmpName("Ahmad");
        System.out.println(emp1.getEmpName());
        emp1.setJob("Sales person");
        System.out.println(emp1.getJob());
    }
}
