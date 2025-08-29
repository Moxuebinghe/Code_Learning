package methodOverload;

public class returnDemo {
    public static void main(String[] args) {
        division(10,0);
    }
    public static void division(int a, int b){
        if(b == 0){
            System.out.println("error, cannot divide 0");
            return;//return关键字，结束当前方法
        }
        int c = a / b;
        System.out.println("result is: " + c);
    }
}
