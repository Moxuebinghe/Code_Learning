package StaticDemo1;

public class Test {
    public static void main(String[] args) {
        //类变量
        Student.name = "王五";

        Student s1 = new Student();
        s1.name = "张三";
        Student s2 = new Student();
        s2.name = "lisa";

        System.out.println(s1.name);
        System.out.println(s2.name);

        //对象变量
        s1.age = 18;
        s2.age = 26;
        System.out.println(s1.age);
        System.out.println(s2.age);
//        System.out.println(Student.age);//报错
    }
}
