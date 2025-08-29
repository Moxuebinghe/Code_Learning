package array;

public class arrayDemo6 {
    public static void main(String[] args) {
        //反转数组元素
        //双指针法
        // （一个从前往后，一个从后往前）通过两端交换元素逐步反转数组。
        //循环继续的条件是 i < j，即左右指针尚未相遇。
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0, j = arr.length - 1; i < j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");//输出不换行
        }
    }
}
