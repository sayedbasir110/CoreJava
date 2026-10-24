package day9;

public class PrintPrimeNumbers {
    static void main() {
        // print primes numbers 1-100
        for (int i=2; i<=100;i++){
            boolean isPrime=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) System.out.print(i+ ", ");
        }
    }
}
