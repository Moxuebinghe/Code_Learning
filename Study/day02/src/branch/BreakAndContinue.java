package branch;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 1; i < 5; i++){
            System.out.println("the value of i:" + i);
            if(i==3){
                break;//跳出并结束循环
            }
        }

        System.out.println("-------------------");

        for(int j = 0; j < 5; j++){
            if(j==3){
                continue;//跳出到下一次循环
            }
            System.out.println("the value of j:" + j);
        }
    }
}
