package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection_Demo {
    /*
     * 通过用户输入类的全路径，来获取该类的成员方法和属性
     * Declared获取全部不管是私有和公有
     * 1.获取访问类的Class对象
     * 2.调用Class对象的方法返回访问类的方法和属性信息
     */
    public static void main(String[] args) {
        try {
            System.out.println("-------------");
            Class clazz = Class.forName("Reflection.Person");//获取Person类的Class对象
            Class clazz1 = Person.class;
            System.out.println(clazz1.getName());//全类名
            System.out.println(clazz1.getSimpleName());//类名

            System.out.println("-------------");
            //获取Person类的所有方法信息
            Method[] method=clazz.getDeclaredMethods();
            for(Method m:method){
                System.out.println(m.toString());
            }
            Method m = clazz.getDeclaredMethod("setName", String.class);
            System.out.println(m.getName() + "---->" + m.getParameterCount() + "---->" + m.getReturnType());//获取方法名、参数个数、返回值类型

            System.out.println("-------------");
            //获取Person类的所有成员属性信息
            Field[] field=clazz.getDeclaredFields();//getDeclaredFields()获取全部成员属性
            for(Field f:field){
                System.out.println(f.toString());
            }

            System.out.println("-------------");
            //获取Person类的所有构造方法信息（构造器）
            Constructor[] constructor = clazz.getDeclaredConstructors(); //getDeclaredConstructors()获取全部构造器
            for(Constructor c:constructor){//遍历并打印每个构造方法的详细信息
                System.out.println(c.toString() + "---->" + c.getParameterCount());//获取参数个数和参数类型
            }

            // 获取无参构造器并创建实例
            Constructor<?> noArgsConstructor = clazz.getConstructor();
            Person p = (Person) noArgsConstructor.newInstance();
            //在运行时动态创建类的实例,由于是无参构造，输出的 Person 对象属性值都为默认值（null 或 0）
            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
