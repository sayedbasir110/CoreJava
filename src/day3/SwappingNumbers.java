package day3;

public class SwappingNumbers {
    static void main() {
        int a=50;
        int b=20;
        System.out.println("Before swapping:"+a+","+b);
        //a=b; // 10
        a=a+b;  //15 a --> 70
        b=a-b;  //5  b=(a+b)-b b-->50
        a=a-b; // 10 a -->20
        System.out.println("After swapping:"+a+","+b);
    }
}
