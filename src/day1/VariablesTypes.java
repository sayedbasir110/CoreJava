package day1;

public class VariablesTypes {
    int age=50;
    public void student(){
        String name="John"; //local variable (accessible only in student block)
        int age=30;         //local variable (accessible only in student block)
    }
    public static void main() {
        VariablesTypes obj = new VariablesTypes();
        System.out.println(obj.age);
    }
}
