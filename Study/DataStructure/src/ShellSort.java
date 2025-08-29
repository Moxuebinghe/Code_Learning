public class ShellSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 5, 6, 7, 4, 1 };
        int[] result = shellSort(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    // 希尔排序
    // 先将待排序表分割成若干形如 L[i, i + d, i + 2d,…, i + kd] 的“特殊”子表，对各个子表分别进行直接插入排序。
    // 缩小增量d，重复上述过程，直到d=1为止。
    public static int[] shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;// 初始化增量 gap
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int current = arr[i];
                int preIndex = i - gap;

                while (preIndex >= 0 && arr[preIndex] > current) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = current;
            }
            gap /= 2;// 缩小增量, 继续下一轮排序
        }
        return arr;
    }
}
