package day20;

public class TypeCasting {
    static void main() {
        // widening casting (small to large)
        int a=5;
        double b=a;
        System.out.println(b);

        // narrowing casting (large to small)
        double c=32.55;
        int d= (int) c;

        System.out.println(d);
    }
}
