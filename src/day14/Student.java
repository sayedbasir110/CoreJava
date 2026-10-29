package day14;

public class Student {
    String name;
    int age;
    char grade;

    void displayInfo(String name) {
        System.out.println("Name: " + name);
    }
    void displayInfo(String name, int age){
        System.out.println("Name: "+ name+ "    Age: "+ age);
    }
    void displayInfo(String name,int age,char grade){
        System.out.println("Name: "+ name+ "    Age: "+ age+ "    Grade: "+grade);
    }

}
