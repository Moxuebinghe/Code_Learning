package Generics_Demo.generics_Interface;

import java.util.ArrayList;

public interface Data <T>{//泛型接口
    void setData(T data);
    ArrayList<T> getData(String  name);
}
