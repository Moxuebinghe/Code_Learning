package methodOverload;

public class methodTest {
    public static void main(String[] args) {
        //方法重载例子
        fire();
        fire("UN");
        fire("USA",99);
    }
    public static void fire(){
        System.out.println("launch a missile");
    }
    public static void fire(String country){
        System.out.println("launch a missile to the " + country);
    }
    public static void fire(String country, int num){
        System.out.println("launch " + num + " missile to the " + country);
    }
}
