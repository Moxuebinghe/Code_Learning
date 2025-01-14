package operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //扩展赋值运算符的使用
        double a = 9.5;
        double b = 520;
        a += b; // a = (double)(a + b);
        System.out.println(a);
        a -= b; // a = (double)(a - b);
        System.out.println(a);
        byte x = 10;
        byte y = 30;
        // x = x + y; 报错，byte类型在表达式中自动转变成int类型
        x += y; //包含强制转换，等价于 x = (byte)(x + y);
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
        System.out.println(i = j);// = 符号代表赋值，== 才是等于号

        System.out.println("--------逻辑运算符---------");
        double size = 6.8;
        int storage = 16;
        boolean rs1 = size >= 6.95 & storage >= 8;//逻辑与
        System.out.println(rs1);

        boolean rs2 = size >= 6.95 | storage >= 8;//逻辑或，多个条件中有一个是ture，结果为true
        System.out.println(rs2);
        // ！符号表示取反
        System.out.println(!(2 > 1));
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);// 异或运算，前后条件结果不同时输出true

        // && 短路与，左边为false，右边不执行
        int m = 10;
        int n = 20;
        System.out.println(m > 100 && ++n > 99);
        System.out.println(n);// 右边++n没有执行
        // || 短路或，左边是true，右边不执行
        System.out.println(m > 2 || ++n >50);
        System.out.println(n);// 右边++n没有执行
    }
}
