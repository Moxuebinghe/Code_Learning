public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // 二分查找主循环
        while (left <= right) {
            int mid = left + (right - left) / 2; // 防止整数溢出
            if (arr[mid] == target) {
                return mid; // 找到目标，返回索引
            } else if (arr[mid] < target) {
                left = mid + 1; // 目标在右半部分
            } else {
                right = mid - 1; // 目标在左半部分
            }
        }
        return -1; // 未找到目标
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70};
        int target = 10;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("元素 " + target + " 在索引 " + result);
        } else {
            System.out.println("元素 " + target + " 不存在");
        }
    }
}