package day15;

public class BMSMain {
    static void main() {
        BMS account = new BMS(
                "ACC1001",
                "Ali",
                1000,
                "1234"
        );
        account.deposit(200);
        account.withdraw(100,"1234");
        account.getBalance("1234");
        account.changePin("1234","5678");

    }
}
