package day19;

public class ThrowNewException {
    double balance=1000;
    void withdraw(double amount) throws InsufficientBalanceException{
        if (amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance-=amount;
    }
}
