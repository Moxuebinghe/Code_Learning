package HashMap_Demo;

import java.util.*;

public class MapCase {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 0; i < 50; i++) {//模拟每次一个学生选择一个景点，存入集合
            int index = r.nextInt(4);//边界值：3
            data.add(selects[index]);
        }
        System.out.println(data);

        //统计每个景点被选择的次数，键是景点名称，值是投票次数
        Map<String, Integer> rs = new HashMap<>();
        for (String select : data) {
            if (rs.containsKey(select)) {
                rs.put(select, rs.get(select) + 1);//当前景点被统计过，值+1
            } else {
                rs.put(select, 1);//当前景点没有被统计过，第一次统计，值为1，景点=1
            }
        }
        System.out.println(rs);
    }
}
