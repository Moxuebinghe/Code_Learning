package Exception_Demo;
import java.util.Scanner;

public class ExceptionTest {// 异常处理
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int a = sc.nextInt();
        System.out.print("请输入除数：");
        int b = sc.nextInt();

        try {
            int result = divide(a, b);  // 可能抛出 ArithmeticException
            System.out.println("结果 = " + result);
        } catch (ArithmeticException e) {
            // 捕获并处理异常
            System.out.println("捕获到算术异常：" + e.getMessage());//getMessage方法获取异常信息
        } finally {
            // 无论是否发生异常都会执行
            System.out.println("finally 块：资源清理或收尾工作");
            sc.close();
        }
    }

    // 简单除法方法
    private static int divide(int x, int y) {
        return x / y;   // 当 y==0 时抛出 ArithmeticException
    }
}
