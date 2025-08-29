public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 0, 2, 3, 4, 1 };
        int[] result = insertionSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    // 插入排序
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {  //循环从1开始，因为第一个元素默认已排序
            int current = arr[i];  //待排元素
            int preIndex = i - 1; //preIndex 指向已排序部分的最后一个元素

            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];  //将已排序元素向后移动一位
                preIndex -= 1;  //下次循环的preIndex位置，用于和当前元素比较
            }   // 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
            arr[preIndex + 1] = current;
        }
        return arr;
    }
}
