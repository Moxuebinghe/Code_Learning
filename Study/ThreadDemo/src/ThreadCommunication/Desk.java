package ThreadCommunication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
    /*
     * 桌子作用：控制生产者和消费者的执行
     * */
    //是否有面条  0：没有面条  1：有面条
    public static int foodFlag = 0;

    //总个数
    public static int count = 20;

    //锁对象
    public static final Lock lock = new ReentrantLock();//采用实现的类ReentrantLock()构建锁对象
}
