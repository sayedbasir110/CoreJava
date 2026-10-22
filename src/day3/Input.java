package day3;


import java.util.Scanner;

public class Input {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter person1 age:");
        int person1 = input.nextInt();
        System.out.print("Enter person2 age:");
        int person2=input.nextInt();
        System.out.println(person1+"  "+person2);
        System.out.print("Name:");
        String name = input.next();
        System.out.println(name);
        input.close();
    }
}
