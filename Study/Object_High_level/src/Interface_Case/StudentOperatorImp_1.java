package Interface_Case;

import java.util.ArrayList;

public class StudentOperatorImp_1 implements StudentOperator{//实现类，负责第一套方案实现

    @Override
    public void printAll(ArrayList<Student> students) {
        System.out.println("=====全班学生信息=====");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);//获取每个学生对象,get(i)表示索引位置处的元素
            System.out.println(s.getName() + "，性别 " + s.getSex() + "，成绩 " + s.getScore());
        }
        System.out.println("班级总人数是：" + students.size());
        System.out.println("=====");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            sum += s.getScore();
        }
        System.out.println("平均成绩是：" + (sum) / (students.size()) );
    }
}
