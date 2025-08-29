package operator;
// 算术运算符
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(5 % b);//求余数，余1
        System.out.println(5 / 2);//Java执行整数除法,会截断小数部分，只保留整数部分。
        System.out.println(5.0 / 2);//2.5

        //+符号作为连接符，连接字符串
        System.out.println("abc" + a);
        System.out.println(b + 5);
        System.out.println("abc" + a + 'D');
        System.out.println(b + 'D' + "abc");//前两项可计算则算，之后再连接字符串，D的ASCII码为68
    }
}
