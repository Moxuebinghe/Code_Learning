public class SequentialSearch {
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // 返回目标元素的索引
            }
        }
        return -1; // 未找到目标元素
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int target = 9;
        int result = sequentialSearch(array, target);
        if (result != -1) {
            System.out.println("元素 " + target + " 找到，索引为: " + result);
        } else {
            System.out.println("元素 " + target + " 未找到");
        }
    }
}
