package day8;

public class TwoDimensionalArrays {
    static void main() {
        // Declare
        int numbers[][]=new int[2][3]; // 2 rows and 3 col
        numbers[0][0]=100;
        numbers[0][1]=200;
        numbers[0][2]=300;
        numbers[1][0]=400;
        numbers[1][1]=500;
        numbers[1][2]=600;

        String names[][]={
                {"Ali","Maryam","Ahmad"},
                {"Ahmad","Samim","Tamim"}};

        System.out.println("row of numbers: "+numbers.length);
        System.out.println("columns of numbers: "+numbers[0].length);

        System.out.println(numbers[0][2]);
        // print all elements
        /*
        for (int row=0;row<numbers.length;row++){
            for (int col=0;col<numbers[0].length;col++){
                System.out.print(numbers[row][col]+"    ");
            }
            System.out.println();
        }

         */

        for (int[] row:numbers){
            for (int number:row){
                System.out.print(number+"   ");
            }
            System.out.println();
        }
    }
}
