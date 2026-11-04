package day18;

public class Tesla extends Vehicle implements Chargeable, Insurable{
    int numberOfMotors;
    Tesla(int numberOfMotors){
        super("Tesla",220);
        this.numberOfMotors=numberOfMotors;
    }

    @Override
    void starts() {
        System.out.println("Tesla starts silently!");
    }
    @Override
    public void charge(){
        System.out.println("Tesla can charge!");
    }
}
