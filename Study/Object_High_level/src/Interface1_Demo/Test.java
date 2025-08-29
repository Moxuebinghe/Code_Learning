package Interface1_Demo;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME);
        D d = new D();//创建实现类对象D，创建对象时，会调用D类中的无参构造方法
        d.testb1();
    }
}
