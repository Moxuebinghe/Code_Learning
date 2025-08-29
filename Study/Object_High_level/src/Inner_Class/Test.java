package Inner_Class;

public class Test {
    public static void main(String[] args) {
        //演示匿名内部类的使用
//        Animal d = new Dog();
//        d.eat();

        //匿名内部类
        // 格式：      new 类或接口(参数值){类体;};
        Animal a = new Animal(){
            @Override
            void eat() {
                System.out.println("吃吃吃");
            }
        };
        a.eat();
    }
}

//class Dog extends Animal{
//    @Override
//    void eat() {
//        System.out.println("吃吃吃");
//    }
//}
abstract class Animal{
    abstract void eat();
}