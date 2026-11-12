package exerciseDay1;

public class Main {
    static void main() {
        Student ali=new Student("Ali",90,100,85.2,88.3,55);
        Student maryam=new Student("Maryam",95,98,88,100,98);

        System.out.println(ali.getStudentName());
        System.out.println("Total: "+ali.totalScore());
        System.out.println("Average: "+ali.average());
        System.out.println("Grade: "+ali.grade());

        System.out.println(maryam.getStudentName());
        System.out.println("Total: "+maryam.totalScore());
        System.out.println("Average: "+maryam.average());
        System.out.println("Grade: "+maryam.grade());

    }
}
