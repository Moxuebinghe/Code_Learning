package tests;

import java.util.Random;
import java.util.Scanner;

public class lottery {
    //双色球案例
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumbers();
        printArray(userNumbers);
        int[] createLuckyNumbers = createluckyNumbers();
        printArray(createLuckyNumbers);
        judge(userNumbers,createLuckyNumbers);
    }

    public static void printArray(int[] arr){//打印号码
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i]: arr[i]+ ",");
        }
        System.out.println("]");
    }

    public static int[] userSelectNumbers(){//用户投注一组号码并打印
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //前六个为红球，最后一个为蓝球
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {//死循环
                System.out.println("请您输入第" + (i+1) + "个红球号码（1~33之间，不能重复）：");
                int number = sc.nextInt();

                //判断红球号码输入是否在正确范围
                if(number < 1 || number >33){
                    System.out.println("输入错误！请重新输入：");
                }else{
                    //接着判断是否重复
                    if(exist(numbers,number)){//调用exist方法判断号码是否已存在数组中
                        System.out.println("当前输入重复,请重新输入：");
                    }else{
                        numbers[i] = number;
                        break;//输入正确红球号码，结束死循环
                    }
                }
            }
        }
        //输入蓝球号码并判断
        while (true) {
            System.out.println("请输入蓝球号码：");
            int number = sc.nextInt();
            if(number < 1 || number > 16){
                System.out.println("输入错误！请重新输入：");
            }else{
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }
    public static boolean exist(int[]numbers, int number){
        //判断number是否已存在数组中
        for (int i = 0; i < numbers.length; i++) {
            if(number == numbers[i]){
                return true;
            }
        }
        return false;
    }
    //设计方法用于随机一组中奖号码
    public static int[] createluckyNumbers(){
        int[] numbers = new int[7];
        Random r = new Random();

        //随机前六位红球号码，范围1~33之间
        for (int i = 0; i < numbers.length-1; i++) {
            while (true) {
                int number = r.nextInt(33) + 1;
                if (!exist(numbers,number)) {//若之前没有出现过，则传入数组numbers
                    numbers[i] = number;
                    break;//结束死循环
                }
            }
        }
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    //判断用户是否中奖
    public static void judge(int[] userNumbers, int[] luckyNumbers){
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userNumbers.length - 1; i++) {//遍历用户号码
            //用户选择号码是否命中奖池
            for (int j = 0; j < luckyNumbers.length; j++) {
                if(userNumbers[i] == luckyNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }
        blueCount = userNumbers[6] == luckyNumbers[6] ? 1 : 0;

        System.out.println("命中红球数量是：" + redCount);
        System.out.println("命中蓝球数量是：" + blueCount);
        //判断中奖详情并输出
        if (redCount == 6 && blueCount == 1){
            System.out.println("中了一等奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("中奖3000元");
        }else {
            System.out.println("感谢您的支持！");
        }
    }
}
