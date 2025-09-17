package ThreadTest;

public class Thread_2 {
    public static void main(String[] args)
    {
        //匿名内部类写法
        //先创建Runnable接口的匿名内部类对象
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.println("子线程1输出：" + i);
                }
            }
        };
        new Thread(r).start();//创建Thread线程对象，并启动

        System.out.println("--------------");
        //简化形式1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.println("子线程2输出：" + i);
                }
            }
        }).start();

        //简化形式2，Lambda表达式
        new Thread(() -> {
                for (int i = 1; i < 10; i++) {
                    System.out.println("子线程3输出：" + i);
                }
        }).start();

        for (int i = 0; i < 10; i++) {//主线程任务放在启动子线程后面
            System.out.println("主线程main输出：" + i);
        }
    }
}
