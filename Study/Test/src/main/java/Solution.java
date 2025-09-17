import java.util.*;

public class Solution {
/**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法
     * @param a int整型ArrayList
     * @return int整型
     */
    public int getMode (ArrayList<Integer> a) {
        // write code here
        // 健壮性检查，虽然题目暗示非空，但加上可以防止意外
        if (a == null || a.isEmpty()) {
            // 根据题目描述，数组元素数量不超过100，隐含非空。
            // 例如，如果约定数组不会为空，则直接进入后续逻辑。
            // 如果平台对异常处理有要求，需要根据具体要求来。
            throw new IllegalArgumentException("Input ArrayList cannot be null or empty.");
        }

        // 1. 使用 HashMap 统计每个数字出现的频率
        // 键是ArrayList中的数字，值是该数字出现的次数
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) { // 遍历 ArrayList
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 2. 找出最大的出现频率
        int maxFrequency = 0;
        // 遍历 HashMap 的值（即频率）来找到最大频率
        for (int count : frequencyMap.values()) {
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        // 3. 找出所有出现频率等于最大频率的数字中最小的那个
        // 初始化 smallestMode 为一个非常大的值，确保任何众数都会比它小
        int smallestMode = Integer.MAX_VALUE;

        // 遍历 HashMap 的所有条目（键值对）
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                // 如果当前数字的频率等于最大频率，则它是众数之一
                // 我们需要从中找到最小的那个
                if (entry.getKey() < smallestMode) {
                    smallestMode = entry.getKey();
                }
            }
        }
        return smallestMode;
    }
}

//public class Singleton {
//
//    // 1. 在类加载时就创建好唯一实例。
//    // 使用 private static final 修饰，保证实例是唯一的，且不可变。
//    private static final Singleton INSTANCE = new Singleton();
//
//    // 2. 私有化构造方法，防止外部直接通过 new 关键字创建实例。
//    private Singleton() {
//        // 在这里可以放置一些实例化的初始化逻辑。
//        // 由于 INSTANCE 是在类加载时创建的，所以这个构造方法只会被调用一次。
//    }
//
//    // 3. 提供一个公共的静态方法，作为获取唯一实例的全局访问点。
//    public static Singleton getInstance() {
//        return INSTANCE;
//    }
//}
