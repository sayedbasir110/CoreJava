package day16;

public class Puppy extends Dog{
    Puppy(String name,String category,String gender){
        super(name,category,gender);
        System.out.println("Puppy constructor is calling");
    }
    @Override
    void sound(){
        System.out.println("Puppy barks!");
    }
}
