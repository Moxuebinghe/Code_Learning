package array;

import java.util.Random;
import java.util.Scanner;

public class arrayDemo7 {
    //随机排名,输入数据后，打乱顺序
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        //输入数据
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入当前第" + (i+1) +"个员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }
        //随机排序
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[index];//将随机索引 index 处的元素保存到临时变量 temp
            codes[index] = codes[i];//将当前索引 i 处的元素赋值给随机索引 index 的位置
            codes[i] = temp;//(新建临时变量temp是因为直接交换两个变量的值会导致其中一个变量的值被覆盖，从而丢失数据)
        }
        //输出数据
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
