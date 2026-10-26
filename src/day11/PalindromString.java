package day11;

import java.util.Scanner;

public class PalindromString {
    static void main() {
        // check whether a String is palindrome or not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.next();
        String reversed=new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");


    }
}
