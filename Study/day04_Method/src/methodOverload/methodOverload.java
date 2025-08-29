package methodOverload;

public class methodOverload {
    //方法重载，同一个类中，多个方法名相同，参数列表不同
    public static void main(String[] args) {

    }
    public static void test(){
        System.out.println("test1");
    }
    public static void test(int a){
        System.out.println("test2" + a);
    }
    void test(double a){

    }
    int test(int a, int b){
        return a + b;
    }
}
