package TypeConversion;

public class TypeConversion2 {
    public static void main(String[] args) {
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
