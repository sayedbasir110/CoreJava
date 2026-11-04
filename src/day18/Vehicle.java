package day18;

public abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }

    abstract void starts();
    void stop(){
        System.out.println("Vehicle stopped!");
    }
}
