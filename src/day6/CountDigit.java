package day6;

import java.util.Scanner;

public class CountDigit {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp=number;
        int digitCount=0;
        while (number!=0){
            number=number/10;
            digitCount++;
        }
        System.out.println(temp+"  ->  "+digitCount+" digits");
    }
}
