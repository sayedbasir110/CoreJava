package day3;

public class OperatorsPractice {
    static void main() {
        int a=10;
        String OddOrEven= (a%2==0) ? "Even" : "Odd";
        System.out.println(OddOrEven);

        int b=20;
        System.out.println("Before swapping:"+a+","+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+a+","+b);
    }
}
