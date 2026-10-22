package day7;

import java.util.Scanner;

public class CountDecimalDigit {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        double absNumber=Math.abs(number);
        String text= String.valueOf(absNumber);
        int intDigits=0;
        int decimalDigit=0;
        for (int i=0;i<text.length();i++){
            char integerPart=text.charAt(i);
            if (integerPart=='.') break;
            intDigits++;
        }
        if(text.charAt(text.length()-1)=='0') decimalDigit=0;
        else {
            for (int i = text.length() - 1; i >= 0; i--) {
                char decimalPart = text.charAt(i);
                if (decimalPart == '.') break;
                decimalDigit++;
            }
        }
        System.out.println(number+" -> "+ intDigits+" integer digits and "+decimalDigit+" decimal digits");
    }
}
