package method;

public class parameterDemo2 {
    public static void main(String[] args) {
        //引用类型的值传递
        int[] arrs = new int[]{10, 20, 30};
        change(arrs);//传输存储的地址值而不是元素值
        System.out.println("main:" + arrs[1]);
    }

    public static void change(int[] arrs){
        System.out.println("方法内1：" + arrs[1]);//引用类型的值传递
        arrs[1] = 222;
        System.out.println("方法内2：" + arrs[1]);
    }
}
