package day20;

import java.util.ArrayList;

public class ArrayListExample {
    static void main() {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(55);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(40);
        numbers.add(50);
        numbers.add(45);
        numbers.add(11);
        numbers.add(12);

        System.out.println(numbers);
        System.out.println(numbers.size());

        int max=numbers.get(0);
        int min=numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (numbers.get(i)>max) max=numbers.get(i);
            if (numbers.get(i)<min) min=numbers.get(i);
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
