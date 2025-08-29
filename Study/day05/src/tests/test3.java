package tests;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("平均分为：" + getAverage(5));
    }
    public static double getAverage(int num){
        //评委打分案例
        //定义动态初始化数组
        int[] scores = new int[num];
        Scanner sc = new Scanner(System.in);
        //存入分数
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) +"个评委的分数:");
            int score = sc.nextInt();
            scores[i] = score;
        }
        //求最值和均值
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score > max){
                max = score;
            }
            if(score < min){
                min = score;
            }
        }
        return 1.0 * (sum - max - min) / (num - 2);//计算平均分
    }
}
