package day21;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {
    static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Ahmad");
        names.add("Karim");
        names.add("Samim");
        System.out.println(names);
        names.addFirst("Ali");
        System.out.println(names);
        names.addLast("Maryam");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        names.removeFirst();
        System.out.println(names);


    }
}
