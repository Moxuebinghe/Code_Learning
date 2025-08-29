package tests;

public class multiplication {
    //打印乘法表
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {//计算机只能打印行，按行思考
            for(int j = 1; j <= i; j++){
                System.out.print(j + "x" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
