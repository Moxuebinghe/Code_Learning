package tests;

import java.util.Random;
import java.util.Scanner;

public class test6 {
    //抢红包案例
    public static void main(String[] args) {
        int[] moneys = {9, 666, 188, 520, 99999};
        start(moneys);
    }
    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < moneys.length; i++) {
            System.out.println("请输入内容开始抽奖：");
            sc.next();
            while (true) {
                int index = r.nextInt(moneys.length);//每次从数组中随机索引一个金额
                int money = moneys[index];
                if(money!=0){
                    System.out.println("抽中红包" + money);
                    moneys[index] = 0;
                    break;//抽中金额则跳出循环
                }
            }
        }
        System.out.println("the activity is ended");
    }
}
