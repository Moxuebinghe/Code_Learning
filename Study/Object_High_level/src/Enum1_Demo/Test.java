package Enum1_Demo;

public class Test {
    public static void main(String[] args) {
        A a = A.A1;//创建枚举对象
        System.out.println(a);

//        A a1 = new A();//错误，不能对外创建枚举对象

        A[] a2 = A.values();//获取枚举对象数组

        A a3 = A.valueOf("A1");//valueOf 方法，根据枚举对象名获取枚举对象
        System.out.println(a3.name());//获取枚举对象名
        System.out.println(a3.ordinal());//对象.ordinal方法 获取枚举对象索引

        //枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的 每个实例 都必须实现它。
        B b = B.B1;
        b.go();//抽象方法
    }
}
