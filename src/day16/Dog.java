package day16;

public class Dog extends Animal{

    Dog(String name,String category, String gender){
        super(name,category,gender);
        System.out.println("Dog constructor is calling");
    }
    @Override
    void sound(){
        super.sound();
        System.out.println("Dog barks!");
    }
}
