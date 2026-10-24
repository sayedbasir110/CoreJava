package day9;

public class FindPrimeNumberInArray {
    static void main() {
        int numbers[]={2,8,5,4,3,9};
        for (int i=0;i<numbers.length;i++){
            boolean isPrime=true;
            for (int j=2;j<numbers[i];j++){
                if (numbers[i]%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)System.out.println(numbers[i]+ " is prime!");
        }
    }
}
