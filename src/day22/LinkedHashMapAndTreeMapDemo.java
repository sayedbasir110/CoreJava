package day22;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMapDemo {
    static void main() {
        TreeMap<Integer,String> students=new TreeMap<>();
        students.put(105,"Ahmad");
        students.put(102,"Karim");
        students.put(103,"Samim");
        students.put(104,"Fahim");
        students.put(106,"Rahim");
        students.put(101,"Hamid");
        System.out.println(students);

        //
        System.out.println(students.get(students.firstKey()));
        System.out.println(students.lastKey());

        System.out.println(students.descendingMap());

    }
}
