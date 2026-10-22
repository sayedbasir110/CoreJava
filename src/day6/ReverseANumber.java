package day6;

import java.util.Scanner;

public class ReverseANumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp=number;
        int reverse=0;
        int digit=0;
        while(number!=0){
            digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        System.out.println(temp+"  ->  "+reverse);

    }
}
