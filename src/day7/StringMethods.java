package day7;

public class StringMethods {
    static void main() {
        String text="Hello World";
        int size=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if (ch==' ') continue;
            size++;
        }
        System.out.println(size);
        char firstCharacter=text.charAt(0);
        char lastCharacter=text.charAt(text.length()-1);
        System.out.println(firstCharacter);
        System.out.println(lastCharacter);
    }
}
