package day16;

public class Cat extends Animal{
    Cat(String name,String category,String gender){
        super(name,category,gender);
        System.out.println("Cat constructor is calling");
    }
    @Override
    void sound(){
        System.out.println("Cat meows!");
    }
}
