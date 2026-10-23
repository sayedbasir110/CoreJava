package day9;

import java.util.Scanner;

public class SearchElementInArray {
    static void main() {
         int numbers[]={10,15,20,35,14,10,13,50};
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number to search within array: ");
         int search=input.nextInt();
         boolean isFound=false;
         int count=0;
         for (int number:numbers){
             if (search==number) {
                 isFound=true;
                 count++;
             }
         }

         if (isFound) {
             System.out.println("Element found "+count+" times!");
         }
         else System.out.println("Element not found!");

    }
}
