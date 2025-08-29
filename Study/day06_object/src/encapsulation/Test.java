package encapsulation;

public class Test {
    public static void main(String[] args) {
        //封装
        Student s1 = new Student();
        s1.setScore(99);
        System.out.println(s1.getScore());
    }
}
