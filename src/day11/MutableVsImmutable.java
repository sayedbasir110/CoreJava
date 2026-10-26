package day11;

public class MutableVsImmutable {
    static void main() {
        /*
        String str="   Welcome";
        str.concat(" to Java"); // can't change the value of str (immutable)
        System.out.println(str);
        str.trim();                 // can't change the value of str
        System.out.println(str);
        System.out.println(str.trim());
        */

        StringBuilder strbuilder=new StringBuilder("Welcome");
        System.out.println(strbuilder);
        strbuilder.append(" to Java"); // can change the value of strbuilder obj (mutable)
        System.out.println(strbuilder);

        String myStr=new String("welcome"); //obj

    }
}
