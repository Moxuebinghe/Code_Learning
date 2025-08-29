package operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //三元运算符， 格式为:   关系表达式?表达式1:表达式2;
        double score = 98.5;
        String rs = score>= 60 ? "成绩及格":"成绩不及格";
        System.out.println(rs);
        //找出两个整数中的较大值
        int a = 99;
        int b = 267;
        int max = a > b ? a : b;
        System.out.println(max);

        int i = 10;
        int j = 45;
        int k = 34;
        int temp = i > j? i : j;
        int max2 = temp > k? temp : k;  //找出三个整数中的较大值
        System.out.println(max2);
        //运算符优先级
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);//true，优先级 && 优先于 ||
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);
    }
}
