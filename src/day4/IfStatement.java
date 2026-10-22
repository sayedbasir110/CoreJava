package day4;

import java.util.Scanner;

public class IfStatement {
    static void main() {
        // Simple calculator
        //Ask the user for two numbers and an operator (+, -, *, /, %). Use if-else or switch to perform the calculation.
        // Handle division by zero.
        Scanner input = new Scanner(System.in);
        System.out.print("num1:");
        double num1=input.nextDouble();
        System.out.print("num2:");
        double num2=input.nextDouble();
        System.out.print("Opt:");
        char opt=input.next().charAt(0);
        double result=0;

        if(opt=='/'&&num2==0) System.out.println("can't be divided by zero!");
        else {
            if(opt=='+'){
                result=num1+num2;
            }
            else if(opt=='-'){
                result=num1-num2;
            }
            else if(opt=='*'){
                result=num1*num2;
            }
            else if(opt=='/'){
                result=num1/num2;
            }
            else System.out.println("invalid operator!");
            System.out.println("result= "+result);
        }


    }
}
