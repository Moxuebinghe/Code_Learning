package array;

import java.util.Scanner;

public class arrayDemo3 {
    public static void main(String[] args) {
        //输入分数并计算平均分
        double[] scores = new double[5];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("please mark this competition:");
            scores[i] = sc.nextDouble();// 将输入的数字保存到数组中
            sum += scores[i];
        }
        System.out.println("the average score is: " + sum/ scores.length);
    }
}
