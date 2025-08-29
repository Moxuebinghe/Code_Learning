package ThreadSafe;

public class DrawThread1 extends Thread{
    private Account1 acc;

    public DrawThread1(Account1 acc, String name) {//取钱线程
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //取钱
        acc.drawMoney(10000);
    }
}
