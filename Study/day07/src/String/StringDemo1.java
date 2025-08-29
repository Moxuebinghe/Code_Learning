package String;

public class StringDemo1 {
    public static void main(String[] args) {
        //直接双引号创建字符串对象
        String name = "itheima";
        System.out.println(name);
        //使用new关键字创建字符串对象
        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("itheima");
        System.out.println(rs2);

        //根据字符数组内容创建字符串对象
        char[] chars = {'a', '黑', '马'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        //根据字节数组内容创建字符串对象
        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);
        System.out.println(rs4);
    }
}
