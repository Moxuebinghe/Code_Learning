package ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account1 {
    private String accountID;
    private double balance;
    //创建锁对象,lk是实例变量,Lock是接口,不能创建对象，采用实现的类ReentrantLock()构建锁对象
    // 此处需要将Lock锁变为静态，以保证全局唯一，而不会创建多个Lock锁
    private final Lock lk = new ReentrantLock();

    public Account1() {
    }

    public Account1(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();//获取当前线程名称,判断现在是谁取钱
        try {
            lk.lock();//获取锁
            if (money > balance) {
                System.out.println(name + "取钱失败，余额不足");
            } else {
                System.out.println(name + "取钱成功，取钱金额：" + money);
                balance -= money;
                System.out.println(name + "余额为：" + balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();//finally的方法始终会执行
        }
    }
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
