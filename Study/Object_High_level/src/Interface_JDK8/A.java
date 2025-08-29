package Interface_JDK8;

public interface A {
    default void test1(){//默认方法
        System.out.println("====接口默认方法====");
        test2();
    }
    private void test2(){//私有方法
        System.out.println("====接口私有方法====");
    }
    public static void test3(){//静态方法,只能用接口名调用
        System.out.println("====接口静态方法====");
    }
    void test4();//抽象方法
}
