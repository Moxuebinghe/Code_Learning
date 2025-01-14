package Scanner;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();//等待用户输入一个整数
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入您的名字：");
        String name = sc.next();
        System.out.println(name + "欢迎您进入系统~~");
    }
}
