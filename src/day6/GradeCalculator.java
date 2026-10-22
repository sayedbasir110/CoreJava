package day6;

import java.util.Scanner;

public class GradeCalculator {
    static void main() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the score: ");
            double score = input.nextDouble();
            if (score<0 || score>100) System.out.println("invalid entry!");
            else if (score>=90) System.out.println("Grade A");
            else if(score>=85) System.out.println("Grade B");
            else if(score>=75) System.out.println("Grade C");
            else if(score>=55) System.out.println("Grade D");
            else if (score<55) System.out.println("Faild");
        }
    }
}
