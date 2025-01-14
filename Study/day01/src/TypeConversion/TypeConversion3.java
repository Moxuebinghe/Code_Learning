package TypeConversion;

public class TypeConversion3 {
    public static void main(String[] args) {
        //强制类型转换
        int a = 20;
        byte b = (byte) a;    //alt+enter键也可以
        System.out.println(a);
        System.out.println(b);

        int i = 1000;
        byte j = (byte) i;
        System.out.println(j);//-24

        double d = 99.99;
        int m = (int) d;
        System.out.println(m);//99，去掉小数部分
    }
}
