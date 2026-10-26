package day11;

import java.util.Arrays;

public class ReverseString {
    static void main() {

        String str="Welcome"; //
        String reverse="";
        /*
        System.out.println("String: "+str);
        for (int i=str.length()-1; i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("Reversed string: "+reverse);

         */

        // approach2: using toCharArray()
        /*
        char character[]=str.toCharArray();
        System.out.println(Arrays.toString(character));
        for (int i=character.length-1;i>=0;i--){
            System.out.print(character[i]);
        }

         */
        // approach3: using mutable strings
        StringBuffer str2=new StringBuffer(str);
        System.out.println(str2.reverse());
    }
}
