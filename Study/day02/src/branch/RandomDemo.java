package branch;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        //快捷键ctrl+alt+T 将代码块放入某循环
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10);
            System.out.println("random generation:"+ number);
        }
        System.out.println("--------------------");
        //生成65-91之间的随机数
        Random r2 = new Random();
        for (int i =0; i < 20; i++) {
            int num2 = r2.nextInt(27) + 65;
            System.out.println("random number which ranges from 65-91:"+ num2);
        }
    }
}
