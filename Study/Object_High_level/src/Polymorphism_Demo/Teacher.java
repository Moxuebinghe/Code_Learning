package Polymorphism_Demo;

public class Teacher extends  People{
    public String name = "teacher类名";
    @Override
    public void run()
    {
        System.out.println("老师2");
    }
    public void teach(){
        System.out.println("老师行为教学");
    }
}
