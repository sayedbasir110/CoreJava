package day8;

public class SingleDimensionalArrays {
    static void main() {
        /*
        // Declare an array
        int numbers[] = new int[5]; // array of integers which can contain 5 integers
        // assignment
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        numbers[5]=60;
         */

        // approach 2
        int numbers[]={10,20,30,40,50,60};
        System.out.println("size of array: "+numbers.length);
        System.out.println("numbers[3]="+numbers[3]);

        // for loop
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        numbers[0]=33;// modified

        // enhanced for loop (for each)
        for (int number:numbers){
            System.out.println(number);
        }

    }
}
