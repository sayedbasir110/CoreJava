package day18;

public class Toyota extends Vehicle implements Insurable{
    Toyota(){
        super("Toyota",260);
    }

    @Override
    void starts() {
        System.out.println("Toyota starts with gas");
    }
}
