package com.hmdp.utils;

/**
 * ThreadLocal工具类
 */
public class BaseContext {
    /** ThreadLocal对象 */
    private static final ThreadLocal threadLocal = new ThreadLocal();

    /**
     * 根据键获取值
     */
    public static <T> T get() {
        return (T) threadLocal.get();
    }

    /**
     * 存储键值对
     */
    public static <T> void set(T value) {
        threadLocal.set(value);
    }


    /**
     * 清除ThreadLocal，销毁线程，防止内存泄漏
     */
    public static void remove() {
        threadLocal.remove();
    }
}
