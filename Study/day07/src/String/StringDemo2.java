package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "黑马java";
        System.out.println(s.length());

        char c = s.charAt(1);//返回指定索引处的 char 值
        System.out.println(c);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);//charAt 用于字符串遍历
            System.out.println(ch);
        }

        System.out.println("-----------------------");
        //将当前字符串转换为字符数组再进行遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        String s1 = new String("alice");
        String s2 = new String("alice");
        System.out.println(s1.equals(s2));//判断字符串是否相等

        //equalsIgnoreCase忽略大小写并比较字符串内容
        String c1 = "34AeFg";
        String c2 = "34aefG";
        System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2));

        System.out.println("-----------------------");
        String s3 = "abcdefg";
        String rs = s3.substring(0,4);//截取字符串 (包前不包后)
        System.out.println(rs);

        String rs2 = s3.substring(2);
        System.out.println(rs2);

        String info = "这个电影是个垃圾电影";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        String info2 = "Alice and bob";
        System.out.println(info2.contains("bob"));
        System.out.println(info2.contains("alice"));//false

        String rs4 = "张三丰";
        System.out.println(rs4.startsWith("张"));
        System.out.println(rs4.startsWith("张三"));
        System.out.println(rs4.startsWith("张三2"));//false

        String rs5 = "张无忌，周芷若，赵敏，小昭";
        String[] names =rs5.split("，");//按照指定内容分割成多个字符串，放到一个字符串数组中返回
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
