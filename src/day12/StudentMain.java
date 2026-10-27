package day12;

public class StudentMain {
    static void main() {
        Student stu1=new Student(); //Object -> Student
        stu1.sId=101;
        stu1.sName="Ahmad";
        stu1.grad='A';
        stu1.printStudentData();

        Student stu2= new Student();
        stu2.sId=102;
        stu2.sName="John";
        stu2.grad='B';
        stu2.printStudentData();
    }
}
