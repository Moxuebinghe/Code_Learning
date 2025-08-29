package StaticAttention;

public class Student {
    static String schoolName;//静态成员变量(类变量)，属于类，所有对象实例共享同一份数据
    double score;//实例成员变量，属于对象，只能用对象访问

    public static void print1(){//类方法，有static关键字
        schoolName = "翻斗";
        print2();
        //类方法可以访问类的成员变量，不能直接访问实例成员
//        System.out.println(score);
//        print3();
    }
    public static void print2(){
        System.out.println(schoolName + "小学");
    }

    public void print3(){//实例方法可以访问类的成员变量，实例方法也可以访问实例成员变量
        schoolName = "翻斗2";
        System.out.println(schoolName + "中学");
        System.out.println(score);
        print4();
        System.out.println(this);//实例方法可以出现this关键字，this表示当前对象，类方法中不能出现this关键字
    }
    public void print4(){
    }
}
