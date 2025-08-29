package Extends_Demo;

class F{
//    public F(){
//        System.out.println("父类F无参构造方法");
//    }
    public F(int name){
        System.out.println("父类F有参构造方法");
    }//父类只有有参构造器时，子类无参构造器会自动调用父类有参构造器
        }
/**
 * 格式
class 父类 {
}

class 子类 extends 父类 {
}
 *
 */
class Z extends F{
    public Z(){
        //子类无参构造器
        //默认调用父类的无参构造器super();
        //super();
        super(10);
        System.out.println("子类Z的无参构造器执行");
    }
    public Z(int name){
        super(name);
        System.out.println("有参构造方法");
    }
        }
public class Test {
    public static void main(String[] args) {
        Z z = new Z();//创建子类对象,默认调用父类的无参构造器
        System.out.println("----------");
        Z z1 = new Z(10);//创建子类对象,有参构造器
    }
}
