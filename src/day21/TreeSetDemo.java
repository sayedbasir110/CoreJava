package day21;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    static void main() {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(60);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);

        TreeSet<String> names=new TreeSet<>();
        names.add("Ahmad");
        names.add("Zahra");
        names.add("Mahmood");
        names.add("Basir");

        System.out.println(names);

        // first()- returns first element
        System.out.println(numbers.first());

        // last()- returns last element
        System.out.println(numbers.last());

        // higher(value) - return the smallest element greater than the given value
        System.out.println(numbers.higher(45)); //50
        System.out.println(numbers.higher(65)); //null

        // lower(value) - return the largest element less than the given value
        System.out.println(numbers.lower(40));

        // ceiling(value) - return the smallest element greater than or equal to the given value
        System.out.println(numbers.ceiling(50));

        // floor(value) - return the largest element less than or equal to the given value
        System.out.println(numbers.floor(50));

        // descendingSet() - sorts the elements in descending order.
        System.out.println(numbers.descendingSet());
    }
}
