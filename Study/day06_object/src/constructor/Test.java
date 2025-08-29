package constructor;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("bob", 99);
        System.out.println(s.name);
        System.out.println(s.score);
    }
}
