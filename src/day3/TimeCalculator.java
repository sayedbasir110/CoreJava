package day3;

public class TimeCalculator {
    static void main() {
        //Exercise 4 — Seconds converter
        //Given totalSeconds = 3672, calculate and print the number of hours, minutes, and remaining seconds.
        int given=-780000;
        int hrs=given/3600; //1
        int mins=(given%3600)/60; //1
        int secs=(given%3600)%60;
        if(given>0){
            System.out.println(given+"=hrs:mins:secs = "+hrs+":"+mins+":"+secs);
        }
        else{
            System.out.println("invalid!");

        }
    }
}
