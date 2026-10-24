package day9;

import java.util.Arrays;

public class SortArray {
    static void main() {
        int numbers[]={5,2,6,3,4,1};
        System.out.println("Before sorting: "+Arrays.toString(numbers));
        ArraySort(numbers);
        System.out.println("After sorting: "+Arrays.toString(numbers));

        int scores[]={90,50,100,70};
        System.out.println("Before sorting: "+Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println("After sorting: "+Arrays.toString(scores));

    }
    public static void ArraySort(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
