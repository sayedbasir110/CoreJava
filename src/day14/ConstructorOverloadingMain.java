package day14;

public class ConstructorOverloadingMain {
    static void main() {
        ConstructorOverloading obj1=new ConstructorOverloading();
        obj1.a=20;
        obj1.display();//40
        ConstructorOverloading obj2=new ConstructorOverloading(2,5);
        obj2.display();
    }
}
