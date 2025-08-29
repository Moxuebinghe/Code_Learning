package ThreadSafe;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("A-123", 10000);//两人共享账户
        //创建两个线程
        new DrawThread(acc, "甲").start();//优先线程执行
        new DrawThread(acc, "乙").start();

        Account acc1 = new Account("A-456", 10000);
        //创建两个线程
        new DrawThread(acc1, "丙").start();
        new DrawThread(acc1, "丁").start();

        Account1 acc2 = new Account1("A-789", 10000);
        new DrawThread1(acc2, "戊").start();
        new DrawThread1(acc2, "己").start();
    }
}
