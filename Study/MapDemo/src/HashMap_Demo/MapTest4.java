package HashMap_Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest4 {
    //第三种方式，forEach方法
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("a", 10.0);
        map.put("b", 20.0);
        map.put("c", 30.0);
        map.put("d", 0.0);
        System.out.println(map);

        System.out.println("----化简前----");//Lambda表达式简化函数式接口的匿名内部类  @FunctionalInterface
        map.forEach(new BiConsumer<String, Double>() {//forEach方法用于遍历集合中的元素
            @Override
            public void accept(String k, Double v) {
                System.out.println(k + "---->" + v);
            }
        });

        System.out.println("----化简后lambda表达式----");//函数式接口有且仅有一个抽象方法，则可以省略方法名，参数类型可省略不写
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
