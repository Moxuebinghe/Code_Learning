package tests;

public class test5 {
    public static void main(String[] args) {
        //拷贝数组
        int[] arr = {11,22,33};
        int[] arr2 = copy(arr);
        printArray(arr2);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1? arr[i]: arr[i] + ",");//三元运算符
        }
        System.out.print("]");
    }
    public static int[] copy(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
