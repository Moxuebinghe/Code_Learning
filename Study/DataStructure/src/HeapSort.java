public class HeapSort {
    static int heapLen;//堆长度

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    private static void buildMaxHeap(int[] arr) {   //建立大根堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {  //从后往前调整所有非终端结点
            headAdjust(arr, i);
        }
    }
    private static void headAdjust(int[] arr, int i) {//堆调整
        int left = 2 * i + 1;   //左子节点的索引
        int right = 2 * i + 2;  //右子节点的索引
        int largest = i;
        if (right < heapLen && arr[right] > arr[largest]) {//判断左右子节点是否大于父节点
            largest = right;
        }
        if (left < heapLen && arr[left] > arr[largest]) {
            largest = left;
        }   //获取左右子节点最大值
        if (largest != i) {     //父节点不是最大值
            swap(arr, largest, i);
            headAdjust(arr, largest);
        }
    }
    public static int[] heapSort(int[] arr) {   //堆排序
        heapLen = arr.length;
        buildMaxHeap(arr);  //初始化大根堆

        for (int i = arr.length - 1; i > 0; i--) { //n - 1趟的堆调整
            swap(arr, 0, i);  //堆顶元素和末尾元素交换
            heapLen -= 1;
            headAdjust(arr, 0); //剩余的待排元素重新调整
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 10, 7, 8, 9, 4, 1 };
//        System.out.println("排序前：");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();   //换行
        System.out.println("排序后：");
        arr = heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
