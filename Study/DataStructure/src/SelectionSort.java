public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 2, 1 };
        int[] sortArr = selectionSort(arr);
        for (int i : sortArr) {
            System.out.print(i + " ");
        }
    }
    // 选择排序
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  //循环进行arr.length - 1 次
            int minIndex = i;//将当前位置 i 视为未排序部分的起始位置,假设当前位置的元素是最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }//遍历未排序序列，如果发现更小的元素，则更新 minIndex
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }//再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾
        }
        return arr;
    }
}

