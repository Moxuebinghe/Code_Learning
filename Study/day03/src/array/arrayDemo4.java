package array;

public class arrayDemo4 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};  //Java 中的数组是引用类型，存储在堆内存中
        int[] arr2 = arr1;  //赋值操作是将引用复制，而不是复制数组内容，因此 arr1 和 arr2 指向同一个数组对象。
        System.out.println(arr1);
        System.out.println(arr2);
        arr2[0] = 99;

        System.out.println(arr1[0]);
    }
}
