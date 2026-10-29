package day14;

public class MethodOverloadingMain {
    static void main() {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.add(2.5,3.6));
        System.out.println(obj.add(2,3,5));
        System.out.println(obj.add(2.5,3.6));
    }
}
