package encapsulation;

public class Student {
    private double score;//隐藏成员变量，封装，只能本类才能访问，其他类都访问不了
    // 公开合适的方法提供给用户访问
    public void setScore(double score){
        if (score >= 0 && score <= 100) {
            this.score = score;
        }else {
            System.out.println("数据非法！");
        }
    }
    public double getScore(){
        return score;
    }
    public void printPass(){
        System.out.println(score >= 60? "pass":"fail");
    }
}
