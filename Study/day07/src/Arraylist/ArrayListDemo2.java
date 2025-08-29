package Arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//泛型，存储在堆内存中的地址
        list.add("Java");
        list.add("bob");
        list.add("Alice");
        list.add("Cate");
        list.add("Demon");
        list.add("Ema");
        System.out.println(list);

        //遍历集合，删除包含某个元素的数据
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if (ele.contains("e")){       //字符串contains方法，判断字符串中是否包含某个字符
//                list.remove(ele);         //remove(i) 会立刻把 i 位置之后的所有元素整体左移一位。
//            }
//        }         //出现bug，删除某元素后，i会自动向前移一位，index错误，方法错误
//        System.out.println(list);

        //解决方法一：
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);//取出遍历的数据
//            if(ele.contains("e")){
//                list.remove(i);
//                i--;//每次删除一个数据，让i后退一位
//            }
//        }
//        System.out.println(list);
        //法二 倒序遍历：
        for (int i = list.size() - 1; i >= 0; i--) {
            String ele = list.get(i);
            if (ele.contains("e")) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
