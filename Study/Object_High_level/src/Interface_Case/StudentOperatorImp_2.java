package Interface_Case;

import java.util.ArrayList;

public class StudentOperatorImp_2 implements StudentOperator{
    @Override
    public void printAll(ArrayList<Student> students) {
        System.out.println("=====全班学生信息=====");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);//获取每个学生对象,get(i)表示索引位置处的元素
            System.out.println(s.getName() + "，性别 " + s.getSex() + "，成绩 " + s.getScore());
            if (s.getSex() == '男'){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println("男生个数：" + count1 + "，女生个数：" + count2);
        System.out.println("=====");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double sum = 0;
        double max = students.get(0).getScore();//获取第一个学生成绩作为初始值
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getScore() > max){
                max = s.getScore();
            }
            if(s.getScore() < min){
                min = s.getScore();
            }
            sum += s.getScore();
        }
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("平均成绩是：" + (sum - max - min) / (students.size() - 2));
    }
}
