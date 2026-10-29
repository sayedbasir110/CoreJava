package day14;

public class BankAccount {
    private final int pin=1234;
    private double balance=1500.00;

    void getBalance(int pin){
        if (pin==this.pin){
            System.out.println("Yours balance is: " +balance);
        }
        else System.out.println("Wrong pin try again!");
    }

    void deposit(int pin, double amount){
        if (pin==this.pin){
            if (amount>0){
                balance+=amount;
                System.out.println(amount + " deposited to your account! ");
                System.out.println("Your new balance is: "+ balance);
            }
            else System.out.println("invalid amount!");
        }
        else System.out.println("Wrong pin try again!");
    }

    void withdraw(int pin,double amount){
        if (pin==this.pin){
            if (amount<balance){
                balance-=amount;
                System.out.println("Your withdrew "+ amount+" from your account!");
                System.out.println("Your balance is: "+ balance);
            }
            else System.out.println("insufficient balance!");
        }
        else System.out.println("Wrong pin try again!");

    }

}
