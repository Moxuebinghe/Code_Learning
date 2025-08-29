package ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {//有参构造方法
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        //在MyCallable类中重写call()方法，描述线程任务，返回线程执行返回的结果
        //如求1~n的累加和
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出了 1~" + n + "的累加和为：" + sum;
    }
}