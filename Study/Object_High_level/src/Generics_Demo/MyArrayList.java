package Generics_Demo;

public class MyArrayList<E> {//自定义泛型类
    private Object[] arr  = new Object[10];//泛型数组,默认为Object,方便添加任意类型元素
    private int size = 0;//记录当前位置
    public boolean add(E e) {//泛型方法,添加E的元素到数组
        arr[size++] = e;
        return true;
    }
    public E get(int index) {//泛型方法,获取元素
        return (E) arr[index];//强转
    }
}
