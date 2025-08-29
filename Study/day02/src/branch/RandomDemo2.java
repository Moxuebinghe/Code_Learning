package branch;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckyNumber = r.nextInt(100) + 1;//0~100之间的随机数
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("please input your guess number:");
            int i = sc.nextInt();
            if(i>luckyNumber){
                System.out.println("bigger number");
            }else if(i<luckyNumber){
                System.out.println("smaller number");
            }else {
                System.out.println("you are right!");
                break;
            }
        }
    }
}
