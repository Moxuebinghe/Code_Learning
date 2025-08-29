package ThreadTest;

public class ThreadTest1 {
    //方法一，通过继承Thread来创建线程
    public static void main(String[] args) {
        Thread t = new MyThread();  //定义一个类MyThread继承Thread类

        t.start();//启动线程，启动线程以后，JVM会创建一个线程对象，并调用run()方法

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程main输出：" + i);//不要把主线程任务放在启动子线程之前
        }
    }
    //主线程和子线程 t 会并发执行，同时进行，但由于线程调度是由操作系统决定的，所以实际的执行顺序和时间分配是不可预测的
    //输出顺序不确定，取决于线程调度器的调度
}
