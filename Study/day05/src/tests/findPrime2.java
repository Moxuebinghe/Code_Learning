package tests;

public class findPrime2 {
    public static void main(String[] args) {
        System.out.println("素数个数是：" + prime(101, 200));
    }
    public static int prime(int start,int end){
        int count = 0;
        OUT://为外部循环指定标签
        for (int i = start; i <= end ; i++) {
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    continue OUT;
                    //OUT: 是一个标签，它被放置在外层 for 循环之前，用于标识这个外层循环。
                    //内层循环中的 continue OUT：在嵌套的内层 for 循环里，当if条件满足时，
                    //continue OUT; 语句会被执行。这会使程序跳过当前内层循环中剩余的语句，并且直接跳转到外层for循环的下一次迭代。
                }
            }
            System.out.println(i);
            count++;
        }
        return count;
    }
}
