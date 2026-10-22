package day8;

import java.util.Scanner;

public class SingleDArrayPractice {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size=input.nextInt();
        int numbers[] = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("numbers["+i+"]: ");
            numbers[i]=input.nextInt();
        }
        System.out.print("numbers: ");
        for (int number:numbers){
            System.out.print(number+"    ");
        }

    }
}
