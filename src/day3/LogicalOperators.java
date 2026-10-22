package day3;

import java.sql.SQLOutput;

public class LogicalOperators {
    static void main() {

        boolean andOp1= true && true;
        boolean andOp2= true && false;

        int a =10;
        int b=20;
        int c=30;
        boolean AIsGreater= a>b && a>c; // false
        System.out.println(a>b || b>c); // false
        System.out.println(a==b || a<c); // true
        System.out.println(!(b<c)); // false
    }
}
