package HashMap_Demo;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    //第一种方式，通过遍历键找值
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 0);
        System.out.println(map);
        //先用map.keySet()方法拿到所有key的单列set，再对每个key调用map.get(key)方法取对应的value
        for (String key : map.keySet()) {//增强for循环(for-each)
            System.out.println(key + ":" + map.get(key));
        }
    }
}
