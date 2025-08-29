package Variable;
// 数据类型
public class Variable {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int i = 2;
        long l = 9223372036854775807L;//long类型字面量需要加L/l，否则识别为默认int类型
        float f = 3.14f;//float类型后面加F/f
        double d = 3.1415926;
        char c = 'c';
        char c1 = '中';//字符型变量，仅存储单个字符
        boolean bool = true;
        boolean bool2 = false;

        // String 字符串类型，引用数据类型
        String name = "tom";
    }
}
