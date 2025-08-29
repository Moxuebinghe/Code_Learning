package Extends_Demo;

public class Test2 {
    public static void main(String[] args) {
        //子类构造器调用父类构造器
        Student s = new Student("张三", 18, "清华大学");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSchool());
    }
}

class Student extends People{//继承People类
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);//子父类中出现重名成员，使用super关键字，指定访问父类成员
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

class People{//父类
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}