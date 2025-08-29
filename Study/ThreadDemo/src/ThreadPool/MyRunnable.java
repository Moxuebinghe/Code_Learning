package ThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行任务");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //实现 Runnable 接口
        //作为可在线程中执行的任务单元
        //可以被线程池调度和执行

        //调用 Thread.sleep(Integer.MAX_VALUE) 使线程进入睡眠状态
        //Integer.MAX_VALUE 是一个非常大的值(2,147,483,647毫秒≈24.8天)
        //这意味着线程会几乎无限期地睡眠
        //有助于测试线程池在高负载下的行为表现
    }
}
