package day5;

import java.util.Scanner;

public class ForLoop {
    static void main() {
        // print numbers 1-10;
        /*
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        */

        // print odd numbers  1-10;

        /*
        for (int i=1; i<=10;i+=2){
            System.out.println(i);
        }
        */
        // print sum of numbers 1-10
        /*
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
        */
        // print numbers 1- 10 (1 odd , 2 even, 3 odd...10)
        /*
        for (int i=1;i<=10;i++){
            if (i%2==0) System.out.print(i+ " even, ");
            else System.out.print(i+" odd, ");
        }
         */
        // print 10 sentences Fibonacci series 1 1 2 3 5 8 13 21 34...
        /*int[] fib= new int[10];
        fib[0]=1;
        fib[1]=1;
        System.out.println(fib[0]);
        System.out.println(fib[1]);
        for (int i=2;i<10;i++){
            fib[i]=fib[i-1]+fib[i-2];
            System.out.println(fib[i]);
        }
        */

        int first=1;
        int second=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(first +", ");
            int next = first+second; // 2
            first = second; // 1
            second =next; //2
        }
        // 1 1 2 3
    }
}
