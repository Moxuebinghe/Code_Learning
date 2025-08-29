package array;

public class arrayDemo1 {
    public static void main(String[] args) {
        // 静态数组定义，已知各元素的值
        int[] ages = new int[]{12, 24, 36};
        double[] scores = new double[]{89.9, 99.5, 59.5};
        // 简写
        int[] ages2 = {12, 24, 36};
        double[] scores2 = {89.9, 99.5, 59.5};
        System.out.println(ages);// 内存地址
        System.out.println(scores);

        System.out.println(ages[0]);
        ages[0] = 99;
        System.out.println(ages[0]);
        System.out.println(ages.length);

        //数组最大索引数(不为0时)array.length - 1
    }
}
