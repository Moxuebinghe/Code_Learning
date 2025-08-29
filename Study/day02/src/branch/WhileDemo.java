package branch;

public class WhileDemo {
    public static void main(String[] args) {
        //折纸案例
        double hallHeight = 8848860;
        int count = 0;
        double paperThickness = 0.1;
        while(paperThickness < hallHeight){
            paperThickness = 2 * paperThickness;
            count++;
        }
        System.out.println("times of folding:" + count);
        System.out.println("-----------------------------");

        int i = 1;
        do{
            System.out.println("the value of i :" + i);
            i ++;
        }while (i<5);
    }
}
