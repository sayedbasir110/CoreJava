package day16;

public class Animal {
    String name;
    String category;
    String gender;

    Animal(String name,String category, String gender){
        this.name=name;
        this.category=category;
        this.gender=gender;
        System.out.println("Animal constructor is calling");
    }

    void displayInfo(){
        System.out.println(name + "   "+ category+ "   "+ gender);
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
    void eat(){
        System.out.println("Animal eats!");
    }
    void sleep(){
        System.out.println("Animal sleeps!");
    }
}
