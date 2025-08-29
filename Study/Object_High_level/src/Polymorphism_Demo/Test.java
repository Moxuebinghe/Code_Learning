package Polymorphism_Demo;

public class Test {
    public static void main(String[] args) {
        //对象多态
        People p = new Student();
        p.run();//行为多态

        //好处1：可实现解耦合，右边对象随时调换
        System.out.println(p.name);//都指向父类
//        p.test();//无法调用子类特有方法

        People p1 = new Teacher();
        p1.run();
        System.out.println(p1.name);

//        Student s1 = (Student)p1; //强制类型转换，可能存在问题，运行时可能出现 ClassCastException类型转换异常
//        s1.test();

        System.out.println("-----------------");
        //好处2 可以使用父类类型变量作为形参， 接受一切子类对象
        Student s = new Student();
        go(s);
        Teacher t = new Teacher();
        go(t);
    }

    public static void go(People p){//父类类型变量作为形参
        p.run();
        if (p instanceof Student){//instanceof 用于判断对象是否是某个类的对象
            Student s = (Student)p;
            s.test();
        }else if(p instanceof Teacher){
            Teacher t = (Teacher)p;
            t.teach();
        }
    }
}
