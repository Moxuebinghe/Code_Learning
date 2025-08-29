import java.util.Arrays;

public class MergeSort {
    // 归并排序
    public static int[] mergeSort(int[] arr) {
        System.out.println("处理数组长度：" + arr.length);   // 打印当前处理的数组长度
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] arr_1 = Arrays.copyOfRange(arr, 0, middle);  // copyOfRange方法创建一个数组，从索引0开始，复制到索引middle-1
        int[] arr_2 = Arrays.copyOfRange(arr, middle, arr.length);   // copyOfRange方法创建一个数组，从索引middle开始，复制到索引arr.length-1
        return merge(mergeSort(arr_1), mergeSort(arr_2));
    }
    public static int[] merge(int[] arr_1, int[] arr_2) {  // 合并两个有序数组
        int[] sorted_arr = new int[arr_1.length + arr_2.length];  // 创建一个新数组，用于保存合并后的有序数组
        int idx = 0, i = 0, j = 0;  // i表示arr_1的索引，j表示arr_2的索引
        while (i < arr_1.length && j < arr_2.length) {
            if (arr_1[i] < arr_2[j]) {
                sorted_arr[idx] = arr_1[i];  // 将较小的元素添加到sorted_arr中
                i += 1;
            } else {
                sorted_arr[idx] = arr_2[j];
                j += 1;
            }
            idx += 1;
        }
        if (i < arr_1.length) {  // 如果arr_1没有被完全遍历完，则将arr_1剩余的元素添加到sorted_arr中
            while (i < arr_1.length) {
                sorted_arr[idx] = arr_1[i];
                i += 1;
                idx += 1;
            }
        } else {
            while (j < arr_2.length) {
                sorted_arr[idx] = arr_2[j];
                j += 1;
                idx += 1;
            }
        }
        return sorted_arr;
    }
    public static void main(String[] args) {
        int[] arr = {22, 11, 33, 44, 55, 66, 77, 88, 99, 10};
        int[] sorted_arr = mergeSort(arr);
        System.out.println("排序后：");
        for (int i = 0; i < sorted_arr.length; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
    }
}