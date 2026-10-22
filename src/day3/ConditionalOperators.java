package day3;

public class ConditionalOperators {
    static void main() {
        int a=10;
        int b=12;
        int c= 7;

        int greatestAB = (a>b)?a:b;   // con ? trueValue : falseValue
        int greatest = (a>b && a>c) ? a : (b>a && b>c)? b : c;
        boolean isAGreater= (a>b) ? true : false;

        int age=15;
        String vote= (age>=18) ? "Eligible" : "Not Eligible";
        System.out.println(greatestAB);
        System.out.println(greatest);
    }
}
