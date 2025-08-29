package operator;
//自增自减运算符，只能对变量使用
public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 1;
        ++ a;//a = a + 1,单独使用时++a和a++没有区别
        System.out.println(a);

        int i = 10;
        int rs = ++i;//先加后用,使用更新后的值参与运算
        System.out.println(rs);// 11
        System.out.println(i);//i已经自增1，值为11

        int j = 10;
        int rs2 = j++;//先用后加
        System.out.println(rs2);// 10
        System.out.println(j);// 11

        System.out.println("---------------------------");
        int m = 5;
        int n = 3;
        //            6  -  5  + 5   - 4   +  4  + 3
        int result = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(result);//9
        System.out.println(n);

        int c = 10;
        int d = 5;
        //         10 + 12  - 4   - 5   + 1 + 12
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c);// 11
        System.out.println(d);// 5
    }
}
