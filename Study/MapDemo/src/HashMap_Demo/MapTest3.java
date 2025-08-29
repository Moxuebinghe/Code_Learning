package HashMap_Demo;

import java.util.*;
import java.util.function.BiConsumer;

public class MapTest3 {
    //第二种方式，键值对
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("a", 100.0);
        map.put("b", 200.0);
        map.put("c", 300.0);
        map.put("d", 0.0);
        System.out.println(map);

        //调用map集合的entrySet方法，一次性返回所有 键值对 对象
        for (Map.Entry<String, Double> entry : map.entrySet()) {//然后使用方法重载
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
