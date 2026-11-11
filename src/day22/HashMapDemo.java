package day22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    static void main() {
        HashMap<Integer,String> students=new HashMap<>();

        //Adding elements(pairs)
        students.put(101,"Ali");
        students.put(102,"Maryam");
        students.put(103,"Samim");
        students.put(104,"Ali");
        students.put(102,"Tamim"); // updates Maryam to Tamim since both have same keys
        System.out.println(students);

        //Accessing elements
        System.out.println(students.get(102));

        // removing elements
        students.remove(103);
        System.out.println(students);
        students.remove(101,"Ali");
        System.out.println(students);

        //checking elements
        System.out.println(students.containsKey(102));
        System.out.println(students.containsKey(103));
        System.out.println(students.containsValue("Ali"));

        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println(students.entrySet());

        // adds element if key doesn't exist
        students.putIfAbsent(103,"Maryam");
        System.out.println(students);

        System.out.println(students.getOrDefault(105,"No such an element"));

        HashMap<Integer,String> javaClass=new HashMap<>();
        javaClass.putAll(students);
        System.out.println(javaClass);

        // looping through the map using key
        for (Integer key: students.keySet()){
            System.out.println(key);
        }

        // looping through the map using value
        for (String value : students.values()){
            System.out.println(value);
        }

        for (var entry:students.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }


        LinkedHashMap<Integer,String> selenium=new LinkedHashMap<>(javaClass);
        selenium.put(105,"Karim");
        selenium.put(106,"Zahra");
        System.out.println(selenium);
        TreeMap<Integer,String> paython=new TreeMap<>(selenium);
        System.out.println(paython);





    }
}
