package day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetDemo {
    static void main() {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);
        System.out.println(numbers);

        numbers.remove(30);
        System.out.println(numbers);

        System.out.println(numbers.contains(50));
        System.out.println(numbers.size());

        for (int number:numbers){
            System.out.println(number);
        }

        HashSet<Integer> nums=new HashSet<>();
        nums.addAll(numbers);
        System.out.println(nums);


        // ArrayList with duplicate elements
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(5);
        System.out.println(a);

        // addAll(collection)- adds all elements from another collection
        HashSet<Integer> uniqueA=new HashSet<>();
        uniqueA.addAll(a);
        System.out.println(uniqueA);

        // removeAll(collection) - removes common elements
        ArrayList<String> students=new ArrayList<>();
        students.add("Ahmad");
        students.add("Mahmood");
        students.add("Samim");
        students.add("Tamim");
        System.out.println("Students: "+students);

        HashSet<String> studentSet=new HashSet<>();
        studentSet.add("Ahmad");
        studentSet.add("Karim");
        studentSet.add("Ali");
        System.out.println("Student set: "+studentSet);

        //studentSet.removeAll(students);
        //System.out.println(studentSet);

        // retainAll() - keeps common elements
        studentSet.retainAll(students);
        System.out.println(studentSet);



    }
}
