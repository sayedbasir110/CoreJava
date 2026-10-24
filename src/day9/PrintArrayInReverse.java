package day9;

public class PrintArrayInReverse {
    static void main() {
        String names[]={"Ali","Zahra","Bashir","Maryam"};
        for (int i=0;i<names.length;i++){
            System.out.print(names[i]+"   ");
        }
        System.out.println();
        for (int i= names.length-1;i>=0;i--){
            System.out.print(names[i]+"   ");
        }
    }
}
