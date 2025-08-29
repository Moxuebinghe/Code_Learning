package ThreadSafe;

public class Account {
    private String accountID;
    private double balance;

    public Account() {
    }

    public Account(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();//获取当前线程名称,判断现在是谁取钱

        synchronized (this) {//同步代码块,此时锁的对象需要确保唯一，否则加锁失效。
            // 建议使用共享资源作为锁对象，实例方法建议使用this作为锁对象

            if (money > balance) {
                System.out.println(name + "取钱失败，余额不足");
            } else {
                System.out.println(name + "取钱成功，取钱金额：" + money);
                balance -= money;
                System.out.println(name + "余额为：" + balance);
            }
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
