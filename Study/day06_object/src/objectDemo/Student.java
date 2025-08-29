package objectDemo;

public class Student {
    String name;
    double chinese;
    double math;
    double score;

    public void printTotalScore(){
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    public void printAverageScore(){
        System.out.println(name + "的平均成绩是：" + (chinese + math)/ 2);
    }

    public void printThis(){
        System.out.println(this);
    }

    public void printPass(double score){
        if(this.score > score){//this关键字，表示当前对象，防止变量名冲突
            System.out.println("成功通过考试！");
        }else{
            System.out.println("落选了~");
        }
    }
}
