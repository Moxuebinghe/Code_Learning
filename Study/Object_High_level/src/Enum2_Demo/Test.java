package Enum2_Demo;

public class Test {
    public static void main(String[] args) {
        check(Constant.BOY);
    }
    public static void check(Constant gender)//check方法参数为Constant枚举类型
    {
        switch (gender)
        {
            case BOY:
                System.out.println("Boy");
                break;
            case GIRL:
                System.out.println("Girl");
                break;
        }
    }
}
