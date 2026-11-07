package day20;

import java.util.ArrayList;

public class ArrayListDemo {
    static void main() {
        ArrayList<Integer> numbers= new ArrayList<>();
        // adding elements add()
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(5);  //2
        numbers.add(10); //3
        System.out.println(numbers);
        // accessing an element get(inex)
        System.out.println(numbers.get(3));
        for (int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        // updating an existing element set(index,newValue);
        numbers.set(0,15);
        System.out.println(numbers);
        // removing an element remove(index);
        numbers.remove(2);
        System.out.println(numbers);
        // size of ArrayList size()
        System.out.println(numbers.size());
        // checking an element contains(value)
        System.out.println(numbers.contains(50));

        System.out.println(numbers.isEmpty()); // false
        //numbers.clear(); // removes all elements
        System.out.println(numbers.indexOf(15)); // returns index of an element  (if element didn't exist return -1)










    }
}
