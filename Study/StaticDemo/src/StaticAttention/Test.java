package StaticAttention;

public class Test {
    public static void main(String[] args) {
        Student.print1();//静态方法，使用：类名.方法名

        //实例方法，属于对象，使用：对象.方法名
        Student s = new Student();
        s.print3();
//        Student.print3();
    }
}
