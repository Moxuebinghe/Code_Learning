package operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //赋值运算符
        double a = 9.5;
        double b = 520;
        a += b; // 相当于  a = (double)(a + b);
        System.out.println(a);
        a -= b; // a = (double)(a - b);
        System.out.println(a);
        byte x = 10;
        byte y = 30;
        //x = x + y; //报错，在表达式中x,y自动提升为int类型
        x += y; //强制转换，等价于 x = (byte)(x + y);复合赋值运算符会自动进行强制类型转换，将 x + y 的结果强制转换为 byte 类型。
        // 强制转换表示把一个表示数据范围大的数值或者变量赋值给另-个表示数据范围小的变量
        System.out.println(x);

        System.out.println("--------关系运算符---------");
        int i = 10;
        int j = 5;
        boolean rs = i > j;
        System.out.println(rs);

        System.out.println(i >= j);
        System.out.println(2 >= 2);
        System.out.println(i < j);
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(10 != 10);
        System.out.println(i = j);// = 符号代表赋值，== 是等于

        System.out.println("--------逻辑运算符---------");
        double size = 6.8;
        int storage = 16;
        boolean rs1 = size >= 6.95 & storage >= 8;//逻辑与，两个都是true，结果为true，否则false
        System.out.println(rs1);

        boolean rs2 = size >= 6.95 | storage >= 8;//逻辑或，只要有一个是ture，结果为true
        System.out.println(rs2);
        // ！符号表示取反
        System.out.println(!(2 > 1));
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(true ^ true);// false
        System.out.println(true ^ false);// 异或运算，前后条件结果不同时，输出true

        // && 短路与，左边为false，右边不执行
        // 当且仅当两个操作数都为真，条件才为真。
        int m = 10;
        int n = 20;
        System.out.println(m > 100 && ++n > 99);
        System.out.println(n);// 右边++n没有执行

        // || 短路或，左边成立，值为true，右边不执行
        System.out.println(m > 2 || ++n >50);
        System.out.println(n);// 右边++n没有执行
    }
}
