package HashMap_Demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();//无序
        map.put("张三", 100);//添加元素
        map.put("张三", 200);
        map.put("三", 300);
        map.put("Java", 0);
        map.put(null, null);
        System.out.println(map);

        System.out.println("--------------");
        System.out.println(map.size());

//        map.clear();
//        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.get("张三"));//获取键对应的值
        System.out.println(map.get("五"));//null
        System.out.println("-------");
        System.out.println(map.remove("张三"));//删除键对应的值，并返回被删除的值200
        System.out.println(map);

        //containsKey 判断键是否存在
        System.out.println(map.containsKey("java"));
        System.out.println(map.containsKey("Java"));
        //判断值是否存在
        System.out.println(map.containsValue(300));
        System.out.println(map.containsValue("300"));//false

        System.out.println("------");
        //set<K> KeySet() 获取全部键的集合
        Set<String> keys = map.keySet();
        System.out.println(keys);
        //获取Map集合的全部值
        Collection<Integer> values = map.values();
        System.out.println(values);
        //把其他集合中的数据全部添加到Map集合中
        Map<String, Integer> map1 = new HashMap<>();//无序
        map1.put("一", 18);
        map1.put("二", 30);
        map.putAll(map1);//把map1中的数据全部添加到map集合中
        System.out.println(map);
        System.out.println(map1);
    }
}
