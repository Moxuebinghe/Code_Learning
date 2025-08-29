package array;

public class arrayDemo2 {
    public static void main(String[] args) {
        //动态初始化数组（使用 new 关键字分配内存，但不显式指定元素值）
        int[] ages = new int[3];
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        ages[0] = 12;
        System.out.println(ages[0]);

        System.out.println("------------------------");
        char[] chars = new char[3];
        System.out.println(chars[0]);//显示错误，转换成int类型显示为0
        System.out.println((int)chars[0]);

        double[] scores = new double[50];
        System.out.println(scores[0]);
        System.out.println(scores[49]);

        boolean[] flags = new boolean[20];
        System.out.println(flags[3]);//默认false

        String[] names = new String[80];
        System.out.println(names[0]);//String type 默认值为 null
    }
}
