package method;

public class arrayCase {
    public static void main(String[] args) {
        //打印int数组内容
        int[] arr = {10, 20, 30, 40};
        printArray(arr);

        int[] arr2 = null;
        printArray(arr2);

        int[] arr3 ={};
        printArray(arr3);
    }

    public static void printArray(int[] arr){
        if(arr == null){
            System.out.println(arr); //若数组输入为null，直接输出null，防止空指针异常
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length - 1) {
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length - 1? arr[i]: arr[i] + ", ");
        }
        System.out.println("]");
    }
}
