package objectDemo;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);//输出默认值null
        System.out.println(s.chinese);
        System.out.println(s.math);

        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();//this拿到得到当前对象的值

        System.out.println("--------------------");

        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();

        Student s3 = new Student();
        s3.score = 350;
        s3.printPass(300);
    }
}
