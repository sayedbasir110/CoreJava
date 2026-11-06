package day19;

import java.util.Scanner;

public class ExceptionHandling {
    static void main() {
        /*
        int div=0;
        System.out.println("Program Started....");
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num=input.nextInt();
        try {
            div=100/num; //ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program in progress...");
        System.out.println(div);
        System.out.println("Program finished...");
         */
        String s="null";
        System.out.println("program started...");
        try {
            System.out.println(s.length()); //NullPointerException
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("program finished...");
        }


        /*
        System.out.println("program started...");
        int a[]=new int[4];
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter position 0-3: ");
        int position=input.nextInt();
        System.out.println("Enter value: ");
        int value=input.nextInt();
        System.out.println("Program in progress...");
        a[position]=value; //ArrayIndexOutOfBoundsException
        System.out.println("a["+position+"] = "+a[position]);
        System.out.println("program finished...");
         */
    }
}
