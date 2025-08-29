package StaticDemo2;

public class Test {
    public static void main(String[] args) {
        //类名.方法名
        Student.printHW();

        Student s = new Student();
        s.printHW(); //对象名.方法名，不建议使用

        //实例方法的使用
        s.printName();
//        Student.printName();//对象名.实例方法报错
    }
}
