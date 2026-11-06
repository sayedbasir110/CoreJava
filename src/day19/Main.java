package day19;

public class Main {
    static void main() throws InsufficientBalanceException{
        ThrowNewException obj=new ThrowNewException();
        System.out.println(obj.balance);
        obj.withdraw(500);
        System.out.println(obj.balance);
    }
}
