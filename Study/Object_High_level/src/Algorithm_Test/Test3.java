package Algorithm_Test;

public class Test3 {
    // 二分查找,在有序数组中高效查找目标值的算法，通过不断将搜索范围缩小一半来快速定位目标。
    public static void main(String[] args) {
        int[] arr = {3, 12, 31, 53, 79, 81, 89, 95, 156};

        int target = 12;
        int index = binarySearch(arr, target);
        System.out.println("目标元素" + target + "在数组中的索引为：" + index);
    }
    public static int binarySearch(int[] arr, int target) {//target表示要找的元素
        int left = 0;// 左边界
        int right = arr.length - 1;
        while (left <= right) {//当left <= right时，计算中间索引mid
            int mid = (right + left) / 2;
            if (arr[mid] == target) {
                return mid;//找到目标元素，返回索引
            } else if (arr[mid] < target) {
                left = mid + 1;//目标在右侧，往右边找，更新左边界为mid + 1
            } else {
                right = mid - 1;
            }
        }
        return -1;// -1特殊结果，表示没有找到目标元素
    }
}
