package ThreadSafe;

public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name) {//取钱线程
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //取钱
        acc.drawMoney(10000);
    }
}
