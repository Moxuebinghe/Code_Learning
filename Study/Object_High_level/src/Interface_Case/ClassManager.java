package Interface_Case;

import java.util.ArrayList;

public class ClassManager {//班级管理类
    private ArrayList<Student> students = new ArrayList<>();//创建集合
    private StudentOperator studentOperator = new StudentOperatorImp_1();//创建对象,实现多个接口实现类
//    private StudentOperator studentOperator = new StudentOperatorImp_2();
    public ClassManager(){//构造方法(构造器)
        students.add(new Student("张三",'男',90));
        students.add(new Student("李四",'女',80));
        students.add(new Student("王五",'男',70));
        students.add(new Student("赵六",'女',60));
    }
    public void printAll(){//显示所有学生信息
        studentOperator.printAll(students);
    }
    public void printAverageScore(){//显示所有学生的平均分
        studentOperator.printAverageScore(students);
    }
}
