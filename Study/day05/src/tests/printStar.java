package tests;

public class printStar {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++){//控制每行前面的空格数量，第一行前面没有空格
                System.out.print(" ");//控制打印多少空格
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(j % 2 == 0 ? " ": "*");//控制打印星星,偶数列打印空格
            }
            System.out.println();
        }
    }
}
