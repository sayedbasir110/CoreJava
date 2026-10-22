package day7;

import java.util.Scanner;

public class LCM {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter a number: ");
        int number2 = input.nextInt();
        System.out.print("Enter a number: ");
        int number3 = input.nextInt();
        int smallest = number1;
        if (number2 < number1 && number2 < number3) smallest = number2;
        if (number3 < number1 && number3 < number2) smallest = number3;
        int lcm = 0;
        for (int i = smallest; ; i += smallest) {
            if (i % number1 == 0 && i % number2 == 0 && i % number3 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);

    }
}
