package day23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    static void main() {
        Queue<String> students = new LinkedList<>();
        students.add("Ali");
        students.add("Maryam");
        students.add("Samim");
        students.add("Tamim");
        students.add("Karim");
        System.out.println(students);

        // adding element
        students.add("Ahmad"); // if cannot add element throws exception
        students.offer("Rahim"); // if cannot add element returns false
        System.out.println(students);

        // removing element
        students.remove(); // throws exception if collection is empty
        System.out.println(students);
        students.poll(); // returns null if collection is empty
        System.out.println(students);

        // accessing element
        System.out.println(students.element()); // throws exception if collection is empty
        System.out.println(students.peek()); // returns null if collection is empty


    }
}
