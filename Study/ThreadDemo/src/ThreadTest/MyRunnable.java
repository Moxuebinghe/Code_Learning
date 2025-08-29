package ThreadTest;

public class MyRunnable implements Runnable{    //实现Runnable接口,此时可以继承其他类、实现其他接口，避免继承限制
    @Override//重写run方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread输出：" + i);
        }
    }
}
