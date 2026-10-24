package day9;

public class FindMissingElement {
    static void main() {
        int numbers[]={1,4,6,5,8};
        for (int i=1;i<=8;i++){
            boolean isFound=false;
            for (int j=0;j<numbers.length;j++){
                if (numbers[j]==i){
                    isFound=true;
                    break;
                }
            }
            if (!isFound)System.out.println(i + " missing");
        }

    }
}
