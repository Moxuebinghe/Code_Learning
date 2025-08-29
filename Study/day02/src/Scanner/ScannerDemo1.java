package Scanner;
import java.util.Scanner;  //导包

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //创建一个Scanner对象
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt(); // 调nextInt()方法，等待用户输入一个整数
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入您的名字：");
        String name = sc.next(); // sc.next()方法，读取用户输入的字符串
        System.out.println(name + "欢迎您进入系统~~");
        sc.close();
    }
}
