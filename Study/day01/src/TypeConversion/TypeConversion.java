package TypeConversion;
public class TypeConversion {
    public static void main(String[] args) {
        //自动类型转换
        //类型范围小的变量可以直接赋值给类型范围大的变量

        byte a = 12;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = c;//范围大
        System.out.println(d);

        char ch = 'a';
        int i = ch;
        System.out.println(i);
    }
}
