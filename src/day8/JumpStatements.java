package day8;

public class JumpStatements {
    static void main() {
        /*
        for (int i=1;i<=10;i++){
            if (i==5) break;
            System.out.println(i);
        }

         */
        for (int i=1;i<=10;i++){
            if (i==5) continue;
            System.out.println(i);
        }
    }
}
