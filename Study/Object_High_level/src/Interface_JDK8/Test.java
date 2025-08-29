package Interface_JDK8;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.test1();//调用接口A的默认default方法
        //b.test2();//报错，接口私有方法不能调用
        A.test3();//只能用接口名A调用static静态方法
    }
}
