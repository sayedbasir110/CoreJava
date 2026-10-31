package day16;

public class AnimalMain {
    static void main() {
        Dog dogObj=new Dog("Buddy","Pet","Male");
        Cat catObj=new Cat("Peshi","Pet","Female");
        Puppy puppyObj= new Puppy("Puppy","Pet","Male");
        dogObj.displayInfo();
        dogObj.sound();
        catObj.displayInfo();
        catObj.sound();
        puppyObj.displayInfo();
        puppyObj.sound();
    }
}
