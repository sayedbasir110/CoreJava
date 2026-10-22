package day6;

import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i+"*"+number+"="+(i*number));
        }
        */
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println("****************************************");
        }

    }
}
