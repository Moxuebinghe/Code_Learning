package tests;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //生成验证码
        System.out.println(createCode(6));
    }

    public static String createCode(int n){
        Random r = new Random();
        String code = "";
        for (int i = 1; i <= n; i++) {
            int type = r.nextInt(3);//分三种情况，每一位先随机选择生成的字符类型
            switch(type){
                case 0:
                    code += r.nextInt(10);//0~9随机数
                    break;
                case 1:
                    char ch1 = (char) (r.nextInt(26) + 65);//随机一个大写字符A~Z，65~65+25
                    code += ch1;
                    break;
                case 2:
                    char ch2 = (char) (r.nextInt(25)+ 97);//随机一个小写字符a~z，97~97+25
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
