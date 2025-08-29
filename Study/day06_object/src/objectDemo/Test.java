package objectDemo;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "播妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "播仔";
        s2.chinese = 59;
        s2.math = 99;
        s2.printTotalScore();
        s2.printAverageScore();
    }
}
