package Algorithm_Test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {2, 1, 5, 4, 3};
        for (int i = 0; i < arr.length - 1; i++){//循环次数,n个元素需要找n-1个最小值
            for (int j = i + 1; j < arr.length; j++){
                //判断当前元素是否大于后面的元素
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        //优化排序算法
        int[] arr1 = {7, 9, 5, 1, 4};
        for (int i = 0; i < arr1.length - 1; i++){
            int minIndex = i;//默认当前元素为最小值
            for (int j = i + 1; j < arr1.length; j++){
                if (arr1[minIndex] > arr1[j]){//判断当前元素是否比最小值小，是则更新最小值索引
                    minIndex = j;
                }
            }
            if(i != minIndex){//说明最小值不在当前位置，在未排序区的其他位置，需要交换到正确位置索引i
                int temp = arr1[i];
                arr1[i] = arr1[minIndex];
                arr1[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
