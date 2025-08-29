package Stream_Demo;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //获取List集合的Stream流
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "张三丰", "张无忌", "赵敏", "周芷若", "小昭");
        Stream<String> stream = names.stream();

        //获取Set集合的Stream流
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "张三", "张三丰", "张无忌", "赵敏", "周芷若", "小昭");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println("-----------------------------------");
        //获取Map集合的Stream流
        Map<String, Double> map = new HashMap<>();
        map.put("张三", 170.0);
        map.put("张三丰", 180.0);
        map.put("张无忌", 169.0);
        map.put("赵敏", 168.0);
        map.put("周芷若", 166.0);
        map.put("小昭", 165.0);

        Set <String> keys = map.keySet();//Set集合存储的是键
        Stream <String> stream2 = keys.stream();

        Collection <Double> values = map.values();//Collection集合存储的是值,得到值的流
        Stream <Double> stream3 = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();    // Map.Entry<String, Double>表示键值对，用Set集合存储
        // 获取Map集合的键值对，map.entrySet方法返回的是Set集合
        // 它的元素类型是 Map.Entry<String, Double>
        Stream <Map.Entry<String, Double>> stream4 = entries.stream();
        stream4.filter(entry -> entry.getKey().contains("张")).forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        String[] names2 = {"张三","张三丰","张无忌","赵敏","周芷若","小昭"};
        Stream <String> stream5 = Arrays.stream(names2);     //获取数组的Stream流，Arrays.stream 只能用于数组
        Stream <String> stream6 = Stream.of(names2);     //of方法，获取数组的Stream流，Stream.of 可以用于多个参数或单个数组/集合
    }
}
