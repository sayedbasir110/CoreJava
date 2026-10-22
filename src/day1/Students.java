package day1;


public class Students {
        static String className="Java Class";       //static variable
        String name;        //instance variable
        int age;            //instance variable


        static void main() {
            Students s1=new Students();
            s1.name="ahmad";
            s1.age=30;

            Students s2=new Students();
            s2.name="ali";
            s2.age=29;
            className="Python";

            System.out.println(s1.name);
            System.out.println(s1.age);;
            System.out.println(s2.name);
            System.out.println(s2.age);
            System.out.println(className);
        }
    }

