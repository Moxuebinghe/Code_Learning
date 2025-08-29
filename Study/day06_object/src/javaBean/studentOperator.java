package javaBean;

public class studentOperator {
    private Student student;
    //Student是类型，student是变量，private代表私有属性
    public studentOperator(Student student){
        this.student = student;
    }
    public void printPass(){
        if(student.getScore() >= 60){
            System.out.println(student.getName() + " is passed");
        }else {
            System.out.println(student.getName() + " is failed");
        }
    }
}
