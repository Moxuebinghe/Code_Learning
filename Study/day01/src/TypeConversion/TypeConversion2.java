package TypeConversion;

public class TypeConversion2 {
    public static void main(String[] args) {
        // byte,short,char—> int —> long—> float —> double
        //整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
        //转换从低级到高级。
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        //在表达式中，byte、short、char是直接转换成int类型参与运算的
        byte b1 = 10;
        byte b2 = 80;
        int b3 = b1 + b2;
        System.out.println(b3);
    }
}
