package method;

public class arrayCase2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println(equals(arr1, arr2));
    }
    //判断数组是否相等（长度和每个元素值）
    public static boolean equals(int[] arr1, int[] arr2){
        //空值检查
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1 == null || arr2 == null){
            return false;
        }
        //长度检查
        if(arr1.length != arr2.length){
            return false;
        }
        //元素值检查
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;//遍历循环后若每个元素都相等，输出true
    }
}
