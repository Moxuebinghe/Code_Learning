package ThreadTest;

public class ThreadTest2 {
    // 创建线程的第二种方法,通过实现 Runnable 接口来创建线程
    public static void main(String[] args) {
        Runnable r = new MyRunnable();//创建MyRunnable任务对象
        new Thread(r).start();//将任务对象作为参数传递给Thread构造方法，创建线程对象并启动

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
