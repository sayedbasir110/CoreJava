package day3;

public class IncrementAndDecrementOperators {
    static void main() {
        int a=10;
        a++; // increment a+1 // post increment
        System.out.println(a);// 11
        System.out.println(a++);// 11
        System.out.println(a++);// 12
        System.out.println(a);// 13
        System.out.println(++a);// 14  // pre-increment
        System.out.println(a++);// 14
        System.out.println(a);// 15

        int b=a++;
        System.out.println(b);// 15
        System.out.println(a);// 16
        b++;
        System.out.println(b); //16
        System.out.println(b++); //16 b=17
        System.out.println(++b); //18

        int c=a--;
        System.out.println(c); //16
        c=a;
        System.out.println(c); //15
    }
}
