package ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        /*
        创建线程池对象
        public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
        BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler);
         */
        ThreadPoolExecutor Pool = new ThreadPoolExecutor(3, 5,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //该配置下线程池的工作流程：
        //当提交任务时，如果线程数少于核心线程数(3)，即使其他工作线程是空闲的，也会创建新线程来处理任务
        //如果线程数达到核心线程数，新任务将被放入队列中等待
        //如果队列已满(容量为4)，且线程数小于最大线程数(5)，则会创建新线程处理任务(临时线程)
        //如果线程数已达最大值且队列已满，将触发拒绝策略处理新任务(默认策略)

        //该配置下线程池最多可同时处理的任务数为：
        //核心线程数 + 队列容量 = 3 + 4 = 7个任务可被立即处理或排队等待
        //当队列满且所有线程都在工作时，还可创建最多2个额外线程(5-3=2)
        //总共可处理的任务数为：最大线程数 + 队列容量 = 5 + 4 = 9个任务

        Runnable task = new MyRunnable();
        Pool.execute(task);//执行任务，无返回值，一般用来执行Runnable任务
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);
        Pool.execute(task);

        Pool.shutdown();

    }
}
