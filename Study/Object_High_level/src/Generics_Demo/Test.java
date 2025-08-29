package Generics_Demo;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();//泛型写法
        list.add("aa");
        list.add("bb");
//        list.add(123);//错误,泛型类型只能是String

        System.out.println(list.get(1));

        System.out.println("---------------------");
        MyClass2<String, Integer> mc = new MyClass2<>();
        mc.show("hello", 123);
    }
}
