package day11;

public class StringComparison {
    static void main() {
        String str1="Welcome";
        String str2="Welcome";
        System.out.println(str1==str2); // compares two objects
        System.out.println(str1.equals(str2)); // compares value of two object
        System.out.println("____________________");

        String str3=new String("Welcome");
        System.out.println(str1==str3); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println("_________________");

        String str4= new String("Welcome");
        System.out.println(str3==str4); // false
        System.out.println(str3.equals(str4));// true
        System.out.println("________________");

        String str5="abc";
        String str6=new String("abc");
        String str7=str6;
        System.out.println(str5==str6); //false
        System.out.println(str6==str7); //true
    }
}
