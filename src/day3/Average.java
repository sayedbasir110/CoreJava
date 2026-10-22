package day3;

import java.util.Scanner;

public class Average {
    static void main() {
        //Ask the user for three numbers and calculate their average.
        // Make sure the result can contain decimals.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1=input.nextInt();
        System.out.print("Enter number2:");
        int num2=input.nextInt();
        System.out.print("Enter number3:");
        int num3=input.nextInt();
        double avg=(num1+num2+num3)/3;
        System.out.println("Average: "+avg);
    }
}
