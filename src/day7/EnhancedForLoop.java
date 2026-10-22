package day7;

public class EnhancedForLoop {
    static void main() {
        String[] names = {"Ali","Ahmad","Mahmood"};
        for (String name:names){
            if (name.charAt(0)=='A') System.out.println(name);
        }
    }
}
