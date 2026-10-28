package day13;

public class Methods {
    int a;
    void display(){ // no param-no return value
       System.out.println("Hello World!");
    }
    String stringDisplayer(){ // no param - returns a value
        return "Ahmad";
    }
    void addNumbers(int a, int b){
        System.out.println(a+b);
    }
    int sum(int a,int b){
        return a+b;
    }

    static void main() {
        Methods obj=new Methods();
        String name= obj.stringDisplayer();
        //System.out.println(name);
        obj.addNumbers(10,20);
        System.out.println(obj.sum(2,5));
    }
}
