package method;

public class parameterDemo {
    //参数传递例子
    public static void main(String[] args) {
        int a = 10;
        change(a); //值传递：传输的是实参存储值的副本
        System.out.println("main:" + a);
    }
    public static void change(int a){
        System.out.println("change1:" + a);
        a = 50;
        System.out.println("change2:" + a);//只影响局部形参，不会影响调用者的变量。
    }
}
