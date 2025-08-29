package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    //通过 Callable 和 Future 创建线程
    public static void main(String[] args) throws Exception{
        Callable<String> call = new MyCallable(100);// 创建Callable线程对象
        FutureTask<String> f1 = new FutureTask<>(call);//把Callable类型对象封装成FutureTask,该FutureTask对象封装了Callable对象的call()方法的返回值。

        new Thread(f1).start();//交给thread对象的start方法启动线程
        String result = f1.get();// get()获取线程执行的返回值
        System.out.println(result);

        Callable<String> call2 = new MyCallable(50);
        FutureTask<String> f2 = new FutureTask<>(call2);
        new Thread(f2).start();
        String rs2 = f2.get();//如果线程执行结果没有返回，则get()会阻塞，等待上面线程执行完毕
        System.out.println(rs2);
    }
}
