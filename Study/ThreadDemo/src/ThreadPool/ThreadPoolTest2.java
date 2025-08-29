package ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception {//需要抛出异常
        //法一，用ThreadPoolExecutor创建线程池对象
        ThreadPoolExecutor Pool = new ThreadPoolExecutor(3, 5,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //法二，用Executors创建线程池对象
//        ExecutorService Pool = Executors.newFixedThreadPool(5);//参数少，可能导致线程阻塞

        Future<String> f1 = Pool.submit(new MyCallable(100));//submit()执行任务，返回Future对象，一般来执行callable任务
        Future<String> f2 = Pool.submit(new MyCallable(200));
        Future<String> f3 = Pool.submit(new MyCallable(300));
        Future<String> f4 = Pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());//复用现有线程：使用已完成任务的空闲线程
        Pool.shutdown();
        //继续提交任务时的线程使用情况：
        //最多使用5个线程（3个核心线程+2个临时线程）
        //最多可处理9个任务（5个线程+4个队列容量）
        //第10个任务开始会被拒绝
    }
}
