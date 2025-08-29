package Interface2_Demo;

public class Test {
    public static void main(String[] args) {
        Driver s = new A();//把A赋给司机类，可以调用司机类中的方法
        s.drive();
        System.out.println("------------------");
        Driver s1 = new B();//面向接口编程，随时可以改变对象，A、B...
        s1.drive();
    }
}

class B implements Driver{//实现类，通过接口Driver扩展对象B的功能

    @Override
    public void drive() {
        System.out.println("B can drive");
    }
}
class A extends Student implements Driver,Singer{//实现类，通过接口Driver,Singer扩展对象A的功能

    @Override
    public void drive() {
        System.out.println("A can drive");
    }

    @Override
    public void sing() {

    }
}
class Student{

}

interface Driver{
    void drive();//必须为抽象方法
}

interface Singer{
    void sing();
}