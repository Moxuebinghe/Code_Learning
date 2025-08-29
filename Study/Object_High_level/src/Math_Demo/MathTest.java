package Math_Demo;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.ceil(3.001));//向上取整
        System.out.println(Math.ceil(4.0));//向上取整
        System.out.println(Math.floor(3.999));//向下取整
        System.out.println(Math.floor(3.0));

        System.out.println(Math.round(3.5));//四舍五入,4
        System.out.println(Math.round(3.49));

        System.out.println("------------------------");
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.pow(3, 2));//3的2次方
        System.out.println(Math.sqrt(9));//开方
        System.out.println(Math.random());//0-1的随机数
    }
}
