package day18;

public class Main {
    static void main() {
        Tesla vehicle1=new Tesla(2);
        Vehicle vehicle2=new Toyota();
        Vehicle vehicle3=new Honda();

        vehicle1.starts();
        vehicle2.starts();
        vehicle3.starts();
        vehicle1.charge();

    }
}
