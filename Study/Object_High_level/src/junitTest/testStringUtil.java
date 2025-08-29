package junitTest;

import org.junit.Test;
import static org.junit.Assert.*;
// 使用JUnit编写的单元测试类 testStringUtil，用于测试 StringUtil 工具类的功能。
public class testStringUtil {
    @Test
    public void reverseString() {//测试字符串反转功能
        String str = "abcdefg";
        String reverse = StringUtil.reverse(str);
        assertEquals("gfedcba", reverse);// assertEquals(expected, actual)表示测试结果是否相等
        System.out.println(reverse);
    }

    @Test
    public void checkBlankString() {//测试字符串是否为空
        String str = "   ";
        boolean b = StringUtil.isBlank(str);
        assertTrue(b);// assertTrue(boolean)表示测试结果是否为true,断言
        System.out.println(b);
    }
}