package String;

import java.util.Random;

public class StringTest2 {
    //生成n位的验证码
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));
    }
    public static String createCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPORSTUVWXYZ0123456789";
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());//随机索引
            code += data.charAt(index);//charAt方法，获取索引处字符
        }
        return code;
    }
}
