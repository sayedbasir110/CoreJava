package day14;

public class ConstructorOverloading {
    int a,b,c; //0

    ConstructorOverloading(){
        a=b=c=10;
    }

    ConstructorOverloading(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    ConstructorOverloading(int a, int b){
        this.a=a;
        this.b=b;
    }

    void display(){
        System.out.println(a+b+c);
    }
}
