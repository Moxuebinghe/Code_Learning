package TypeConversion;

public class TypeConversion3 {
    public static void main(String[] args) {
        //强制类型转换，把一个表示数据范围大的数值(如int)或者变量赋值给另一个表示数据范围小的变量
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int i = 1000;
        byte j = (byte) i;
        System.out.println(j);//由于byte范围为-128到127，所以结果为-24

        double d = 99.99;
        int m = (int) d;
        System.out.println(m);//99，去掉小数部分
    }
}
