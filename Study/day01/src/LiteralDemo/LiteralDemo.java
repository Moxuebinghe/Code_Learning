package LiteralDemo;
//字面量
public class LiteralDemo {//定义了一个类，相当于程序的“容器”。文件名必须与类名一致。
    public static void main(String[] args) { //程序的入口

        System.out.println(99.99);
        System.out.println('θ');
        System.out.println('\t');
        System.out.println("中国");
        System.out.println(true);//布尔值
        System.out.println('\n');//换行符
        double age = 8.8; //double, float
        System.out.println(age);
        System.out.println('a'+10);
        System.out.println('B' * 2);
        int a1 = 0b01100001;//二进制0b
        System.out.println("a1:" + a1);
        int a2 = 0141;//八进制0
        System.out.println(a2);
        int a3 = 0xFA;//十六进制0x
        System.out.println(a3);
        String nullValue = null;
        System.out.println("null:" + nullValue);
    }
}
