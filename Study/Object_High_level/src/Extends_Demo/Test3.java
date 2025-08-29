package Extends_Demo;

public class Test3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("张三", 18, "清华大学");
        //若没有填写学校，则默认为"清华大学"
        Student1 s2 = new Student1("张三", 18);
    }
}

class Student1{
    private String name;
    private int age;
    private String school;

    public Student1() {
    }

    public Student1(String name, int age) {
        this(name, age, "清华大学");//调用兄弟构造器
    }
    public Student1(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}