package exerciseDay1;

public class Student {
    private String studentName;
    private double math;
    private double java;
    private double selenium;
    private double sql;
    private double english;

    public Student(String studentName, double math, double java, double selenium, double sql, double english) {
            if (studentName.isEmpty()) throw new IllegalArgumentException("Name field can't be empty!");
            validateScore(math,"Math");
            validateScore(java,"Java");
            validateScore(selenium,"Selenium");
            validateScore(sql,"Sql");
            validateScore(english,"English");

        this.studentName = studentName;
        this.math = math;
        this.java = java;
        this.selenium = selenium;
        this.sql = sql;
        this.english = english;
    }
    private void validateScore(double score, String subject){
        if (score>100||score<0) throw new IllegalArgumentException("Invalid "+subject+" score please enter in 0-100 range!");
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMath() {
        return math;
    }

    public double getJava() {
        return java;
    }

    public double getSelenium() {
        return selenium;
    }

    public double getSql() {
        return sql;
    }

    public double getEnglish() {
        return english;
    }

    public double totalScore(){
        return (math+java+selenium+sql+english);
    }
    public double average(){
        return totalScore()/5;
    }
    public char grade(){
        if (average()>=90) return 'A';
        else if (average()>=80) return 'B';
        else if (average()>=70) return 'C';
        else if (average()>=60) return 'D';
        else return 'F';
    }
}
