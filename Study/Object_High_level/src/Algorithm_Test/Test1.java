package Algorithm_Test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3};//数组
        //冒泡排序例子
        for (int i = 0; i < arr.length - 1; i++){//循环次数,n个元素需要找n-1个较大值

            for (int j = 0; j < arr.length - i - 1; j++){//每轮减少一次比较,忽略已排序的末尾元素
                // 第 1 轮：比较 n-1 次；第 2 轮：比较 n-2 次（因为最后一个已经排好）
                if (arr[j] > arr[j + 1]){//当前位置的元素arr[j]大于后一个元素，则交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));//Arrays.toString方法输出数组
    }
}
