package day9;

public class FindDuplicates {
    static void main() {
        int numbers[]={1,2,5,1,6,1,2,3,5,6};
        boolean checked[]=new boolean[numbers.length];
        for (int i=0;i<numbers.length;i++){
            int count=1;
            if (checked[i]) continue;
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                    checked[j]=true;
                }
            }
            System.out.println(numbers[i]+" repeats "+count+" times");
        }
    }
}
