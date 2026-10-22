package day5;

public class WhileLoop {
    static void main() {
        // print numbers 1-10
        /*
        int i=1; //starts at 1
        while (i<=10){
            System.out.println(i);
            i++;
        }
        */
        // print even numbers 1-10;
        /*
        int i=2;
        while(i<=10){
            System.out.println(i);
            i+=2; // i=i+2;
        }
         */

        // print number 1-10 -> 1 Odd  2 Even
        int i=1;
        while(i<=10){
            if(i%2==0) System.out.println(i+" -> Even");
            else System.out.println(i+" -> Odd");
            i++;
        }


    }
}
