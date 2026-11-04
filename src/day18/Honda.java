package day18;

public class Honda extends Vehicle implements Insurable{
    Honda(){
        super("Honda",250);
    }

    @Override
    void starts() {
        System.out.println("Honda starts with gas");
    }
}
