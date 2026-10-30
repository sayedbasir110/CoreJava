package day15;

public class BMS {
    private final String accountNo;
    private String ownerName;
    private double balance;
    private String pin;
    private int failedAttempts;
    private boolean locked;

    //constructor
    BMS(String accountNo,String ownerName, double balance, String pin){
        this.accountNo=accountNo;
        if (ownerName==null){
            throw new IllegalArgumentException("Owner Name can't be empty!");
        }
        if (balance<0){
            throw new IllegalArgumentException("Balance can't be negative!");
        }
        if (pin.length()!=4){
            throw new IllegalArgumentException("PIN should be 4 digits!");
        }
        this.ownerName=ownerName;
        this.balance=balance;
        this.pin=pin;
        this.failedAttempts=0;
        this.locked=false;
    }

    // getters and setters
    String getAccountNo(){
        return accountNo;
    }
    void setOwnerName(String ownerName){
        if (ownerName.isEmpty()){
            System.out.println("Owner name can't be empty!");
        }
        else {
            this.ownerName=ownerName;
            System.out.println("Owner name changed to "+ownerName);
        }
    }

    // methods
    void deposit(double amount){
        if (amount<=0) System.out.println("invalid amount!");
        else {
            balance += amount;
            System.out.println(amount + " deposited to your account!");
        }
    }
    boolean isLocked(){
        if (failedAttempts>=3){
            System.out.println("Account locked!");
            locked=true;
            return true;
        }
        else return false;
    }
    void withdraw(double amount, String enteredPin){
        if (isLocked()) System.out.println("Your account is locked");
        if (amount<=0||amount>balance) System.out.println("Invalid amount or insufficient fund!");
        if (authenticatePin(enteredPin)) {
            System.out.println("Withdraw successful!");
            balance-=amount;
        }
    }
    boolean authenticatePin(String enteredPin){
        if (enteredPin.equals(pin)){
            failedAttempts=0;
            return true;
        }
        else {
            System.out.println("Incorrect PIN!");
            failedAttempts++;
            isLocked();
            return false;
        }
    }
    void changePin(String oldPin, String newPin){
        if (authenticatePin(oldPin) && newPin.length()==4) {
            this.pin=newPin;
            System.out.println("PIN successfully changed");
        }
        else if (!authenticatePin(oldPin)) System.out.println("Incorrect PIN!");
        else if (newPin.length()!=4) System.out.println("Invalid new PIN");
    }
    void getBalance(String enteredPin){
        if (isLocked()) {
            System.out.println("Account is locked");
        }
        else if (authenticatePin(enteredPin)) System.out.println(balance);
    }
}
