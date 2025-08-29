package Arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(66);
//        list.add("Java");
//        list.add(99.5);
//        System.out.println(list);//不加<>可在数组中存入所有类型的数据
        ArrayList<String> list = new ArrayList<>();//指定了泛型,泛型参数只能是引用数据类型String
        list.add("黑马");
        list.add("黑马");
        list.add("Java");
        System.out.println(list);

        list.add(1, "Mysql");
        System.out.println(list);
        String rs = list.get(1);//获取集合中索引位置的值
        System.out.println(rs);

        System.out.println("-------------------------");

        System.out.println(list.size()); //获取集合大小

        System.out.println(list.remove(1));    //根据索引删除集合中某个元素的值
        System.out.println(list);

        list.remove("黑马");  //直接删除值(默认删除第一次出现的这个数据，所以删掉第一个黑马）
        System.out.println(list);

        //set方法，修改索引位置处的数据，修改后返回原来的值
        list.set(1, "黑马程序员");
        System.out.println(list);
    }
}
