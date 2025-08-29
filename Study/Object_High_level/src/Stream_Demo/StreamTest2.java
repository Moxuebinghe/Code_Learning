package Stream_Demo;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        // 1. 静态方法引用
        List<Integer> lengths = names.stream()
                .map(String::length) // map() 用于转换流中的每个元素，使用 String::length 将字符串映射为其长度
                .toList(); // toList() 用于将流转换为列表
        System.out.println("Lengths: " + lengths); // 输出: Lengths: [5, 3, 7]

        // 2. 特定对象的实例方法引用
        String prefix = "Mr. ";
        names.forEach(prefix::concat); // 注意：这里仅演示，需配合输出
        names.forEach(name -> System.out.println(prefix.concat(name)));
        // 输出: Mr. alice, Mr. bob, Mr. charlie

        // 3. 任意对象的实例方法引用
        System.out.println("大写名字 Uppercase names:");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        // 输出: ALICE, BOB, CHARLIE

        // 4. 构造方法引用
        List<String> newNames = names.stream()
                .map(String::new) // map() 用于转换流中的每个元素，使用 String::new 将字符串映射为 String 对象
                .toList();
        System.out.println("New names: " + newNames); // 输出: New names: [alice, bob, charlie]
    }
}
