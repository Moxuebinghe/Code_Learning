package Reflection;

import java.lang.reflect.Field;

public class Test {
    /**
     * 接收任意对象，使用反射获取其所有成员变量并输出
     * @param obj 任意对象
     */
    public static void printFields(Object obj) throws Exception {
        if (obj == null) {
            System.out.println("对象为null");
            return;
        }

        // 获取对象的Class对象
        Class<?> clazz = obj.getClass();

        // 输出类名
        System.out.println("类名: " + clazz.getName());

        // 获取所有成员变量（包括私有）
        Field[] fields = clazz.getDeclaredFields();

        if (fields.length == 0) {
            System.out.println("该类没有成员变量");
        } else {
            System.out.println("成员变量列表:");
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);// 禁止检查访问控制
                String value = field.get(obj) + "";
                System.out.println(name + " = " + value);
            }
        }
        System.out.println(); // 空行分隔
    }

    // 测试方法
    public static void main(String[] args) throws Exception {
        // 测试Person对象
        Person person = new Person("张三", "男", 25);
        printFields(person);

        // 测试Test对象
        Test test = new Test();
        printFields(test);

        // 测试null
        printFields(null);
    }
}

