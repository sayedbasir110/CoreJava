package day10;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    static void main() {
        String word="Welcome";
        // String size
        System.out.println(word.length());
        // String concatenation
        System.out.println(word+ " to my Java class");
        System.out.println(word.concat(" to my class").concat("!"));
        // trim
        String name="     Ahmad  ";
        System.out.println(name);
        System.out.println(name.trim());
        // charAt()
        System.out.println(word.charAt(5));
        // contains()- check if a character or sequence of character is within a string - true/false (case-sensitive)
        System.out.println(word.contains("Wel")); //true
        System.out.println(word.contains("E")); // false
        // equals("string")/ true/false
        System.out.println(word.equals("Java")); // false
        System.out.println(word.equals("Welcome")); // true
        // equalsIgnoreCase()
        System.out.println(word.equalsIgnoreCase("WELCOME"));// true
        // replace(oldChar,newChar)
        System.out.println(word.replace('e','E'));
        String message="Welcome to my Java class";
        System.out.println(message.replace("Java","Python"));
        // subString(startIndex, endIndex)
        System.out.println(word.substring(3,6)); //3,4,5
        // toUpperCase()
        System.out.println(word.toUpperCase());
        // toLowerCase()
        System.out.println(word.toLowerCase());
        // slit()- divides a string into parts based on a character
        String str="Welcome to java class";
        System.out.println(Arrays.toString(str.split(" "))); // array of strings
        String email="abc123@gmail.com";
        String array[]=email.split("@");
        System.out.println(Arrays.toString(array));
        // toCharArray()- divides the string into array of characters
        char character[]=str.toCharArray();
        System.out.println(Arrays.toString(character));
        // replaceAll()- regex
        String myString="@!He34l--$lo67s";
        System.out.println(myString.replaceAll("[^0-9a-zA-Z]",""));


    }
}
