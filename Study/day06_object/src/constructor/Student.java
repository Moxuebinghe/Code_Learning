package constructor;

public class Student {
    String name;
    double score;
    //无参数构造器
    public Student(){
        System.out.println("无参数构造器被触发执行了");
    }
    //同样可以方法重载，下面为有参数构造器
    public Student(String name, double score){
        System.out.println("有参数构造器被触发执行了");
        this.name = name;
        this.score = score;
        //对对象成员变量进行初始化赋值
    }
}
