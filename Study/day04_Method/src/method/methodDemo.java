package method;

public class methodDemo {
    public static void main(String[] args) {
        int rs = sum(10, 30);
        System.out.println(rs);
    }
    //格式为:修饰符 返回值类型 方法名（形参列表）
    public static int sum(int a, int b){
        int c = a + b; //方法体
        return c; //return 返回值
    }
}
