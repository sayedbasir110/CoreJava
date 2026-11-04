package day18;

public class WrapperClass {
    static void main() {
        String s1="10";
        String s2="20";
        System.out.println(s1+s2); // 1020
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 30


        String s3="True";
        System.out.println(Boolean.parseBoolean(s3));

        int a=100;
        int b=200;
        System.out.println(a+b); // 300

        Integer intA=new Integer(a);
        Integer intB =new Integer(b);
        System.out.println(intA.toString()+intB.toString()); // 100200
    }
}
