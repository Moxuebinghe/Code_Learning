package String;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        for (int i = 0 ; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录名称：");
            String loginName = sc.next();
            System.out.println("请输入登录密码：");
            String passWord = sc.next();

            boolean rs = login(loginName, passWord);
            if(rs){
                System.out.println("欢迎进入系统~");
                break;
            }else {
                System.out.println("登录名或密码错误，请确认！");
            }
        }
    }
    //用户登录方法
    public static boolean login(String loginName, String passWord){
        String okLoginName = "itheima";
        String okPassWord = "123456";
//        if (okLoginName.equals(loginName) && okPassWord.equals(passWord)){
//            return true;
//        }else {
//            return false;
//        }//简化为下面的一行代码
        return okLoginName.equals(loginName) && okPassWord.equals(passWord);//equals()方法比较字符串内容
    }
}
