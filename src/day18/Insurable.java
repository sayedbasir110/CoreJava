package day18;

public interface Insurable {
    default void insurable(){
        System.out.println("Vehicle is insurable!");
    }
}
