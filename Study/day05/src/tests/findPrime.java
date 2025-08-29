package tests;

public class findPrime {
    public static void main(String[] args) {
        System.out.println("素数个数是" + prime(101, 200));
    }
    public static int prime(int start, int end){
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = true;//信号位思想，每次重置，默认这个数为素数
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    flag = false;
                    break;//如果2到i/2中有数能整除，不是素数，则跳出到下一次j循环
                }
            }
        if(flag){
            System.out.println(i);
            count++;
        }
        }
        return count;
    }
}
