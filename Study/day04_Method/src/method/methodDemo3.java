package method;

public class methodDemo3 {
    public static void main(String[] args) {
        int rs = add(100);
        System.out.println(rs);
        System.out.println("--------------------");

        judge(7);
        judge(88);
    }
    public static int add(int n){//计算从1到n的累加和
        int sum = 0;
        for (int i=1; i < n + 1; i++){
            sum += i;
        }
        return sum;
    }
    public static void judge(int number){//判断数字是偶数还是奇数
        if(number % 2 == 0){
            System.out.println(number +" is an even number!");
        }else{
            System.out.println(number +" is an odd number!");
        }
    }
}
