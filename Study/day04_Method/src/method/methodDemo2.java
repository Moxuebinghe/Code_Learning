package method;

public class methodDemo2 {
    public static void main(String[] args) {
        printhelloworld(3);
        System.out.println("-------------");
        printhelloworld(5);
    }

    //有参数，无返回值void
    public static void printhelloworld(int n){ //循环打印 n 次
        for(int i = 0; i < n; i++){
            System.out.println("hello world!");
        }
    }
}
