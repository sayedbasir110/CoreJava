package day20;

import java.util.ArrayList;

public class ArrayListExample2 {
    static void main() {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10); //0
        numbers.add(55); //1
        numbers.add(10); //2
        numbers.add(20); //2
        numbers.add(15); //3
        numbers.add(40);
        numbers.add(50);
        numbers.add(15);
        numbers.add(15);
        numbers.add(15);


        System.out.println("Before removing duplicates: "+ numbers);

        for (int i=0;i<numbers.size();i++){
            boolean duplicate=false;
            for (int j=i+1; j<numbers.size();j++){
                if (numbers.get(i).equals(numbers.get(j))){
                    if (!duplicate){
                        System.out.println("Duplicate: "+ numbers.get(i));
                        duplicate=true;
                    }
                    numbers.remove(j);
                    j--;
                }
            }
        }

        System.out.println("After removing duplicates: "+ numbers);
    }
}
