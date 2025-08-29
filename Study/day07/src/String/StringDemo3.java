package String;

public class StringDemo3 {
    public static void main(String[] args) {
        String name = "黑马";
        name += "程序员";
        name += "播妞";
        System.out.println(name);

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true，节省内存

        char[] chars = {'a', 'b', 'c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);//每次new出来的都是一个新对象，放在堆内存中

    }
}
