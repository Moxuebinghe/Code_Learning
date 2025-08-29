package ThreadPool;

public class Thread_GiftDelivery {
    /*
    模拟小红和小明同时发送100份礼品，当剩余礼品少于10份时停止发送。
关键点：
多线程：小红和小明各一个线程。
线程安全：共享变量remainingGifts需同步。
终止条件：剩余礼品<10时停止。
统计结果：分别记录小红和小明送出的礼品数量。
     */
    private static int remainingGifts = 100;
    private static int xiaohongCount = 0;
    private static int xiaomingCount = 0;

    public static void main(String[] args) {
        Thread xiaohong = new Thread(new GiftTask("小红"), "小红");
        Thread xiaoming = new Thread(new GiftTask("小明"), "小明");

        xiaohong.start();
        xiaoming.start();

        try {
            xiaohong.join();//通过 join() 方法确保了主线程等待所有工作线程完成后再输出最终统计结果，避免数据不一致。
            xiaoming.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("小红送出了 " + xiaohongCount + " 份礼物");
        System.out.println("小明送出了 " + xiaomingCount + " 份礼物");
    }

    static class GiftTask implements Runnable {//实现Runnable接口
        private final String name;

        public GiftTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (Thread_GiftDelivery.class) {
                    if (remainingGifts < 10) {
                        break;
                    }
                    remainingGifts--;
                    if (name.equals("小红")) {
                        xiaohongCount++;
                    } else {
                        xiaomingCount++;
                    }
                    System.out.println(name + " 送出1份礼物，剩余 " + remainingGifts);
                }
                try {
                    Thread.sleep(10); // 模拟发送耗时
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
