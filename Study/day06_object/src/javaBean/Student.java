package javaBean;

public class Student {
    //实体类，只负责数据存取，必须私有成员变量，并提供每个变量的get set方法
    private String name;
    private double score;
    //类中必须有一个公共无参的构造器
    //(可鼠标右键→generate→constructor创建构造器)
    public Student() {
    }

    public Student(String name, double score){//有参构造器
        this.name = name;
        this.score = score;
    }
    //提供getter，setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
