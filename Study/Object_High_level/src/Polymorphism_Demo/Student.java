package Polymorphism_Demo;

public class Student extends People{
    public String name = "student类名";
    @Override
    public void run()
    {
        System.out.println("学生跑步");//覆盖父类方法，方法重写
    }

    public void test(){//新增方法
        System.out.println("学生行为考试");
    }
}
