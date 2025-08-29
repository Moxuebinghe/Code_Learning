package javaBean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        //此时s1.name = "bob";不适用于私有变量
        s1.setName("Alice");
        s1.setScore(100);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        studentOperator operator = new studentOperator(s1);
        //调用了studentOperator类的带参构造器studentOperator(Student student)，将s1赋值给 studentOperator 类的私有成员变量 student
        operator.printPass();
    }
}
