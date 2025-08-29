public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, -1, 9, 10, 20 };
        int[] result = bubbleSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    //冒泡排序：重复地遍历要排序的序列，依次比较两个元素，如果它们的顺序错误就把它们交换过来。
    public static int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 加入flag，每次外层循环开始时，flag 被初始化为 true，表示默认认为当前数组已经有序
            // 每次外层循环结束后，会检查 flag 的值
            // 如果 flag 仍为 true，说明内层循环中没有发生任何交换，即数组已经处于有序状态，此时可以直接跳出外层循环，提前结束排序
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {  //j从0开始，到arr.length - i 结束，i表示当前已经排序的元素个数
                if (arr[j] > arr[j + 1]) {  // 如果当前元素比下一个元素大，则交换位置
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}
