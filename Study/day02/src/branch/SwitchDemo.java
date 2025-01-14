package branch;
import java.util.Scanner;
/*  语法格式
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}
*/
public class SwitchDemo {
    public static void main(String[] args) {
    String week = "周日";
    switch (week){
        case "周一":
            System.out.println("工作日");
            break;
        case "周二":
            System.out.println("第二个工作日");
            break;
        case "周三":
            System.out.println("最后一个工作日");
            break;
        default:
            System.out.println("信息不存在");
    }
    /*switch 语句中的变量类型可以是： byte、short、int 或者 char。(double 不允许，计算不精确)
    从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
    case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
    当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。
    case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句(穿透性)，直到出现 break 语句。
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入今天是周几：");
    String day = sc.next();
    String week2 = day;
    switch (week2){
        case "周一":
        case "周二":
        case "周三":
            System.out.println("工作中");
            break;
        case "周四":
        case "周五":
            System.out.println("跑业务");
            break;
        case "周六":
        case "周日":
            System.out.println("休息");
            break;
        default:
            System.out.println("输入信息有问题！");
    }
    }
}
