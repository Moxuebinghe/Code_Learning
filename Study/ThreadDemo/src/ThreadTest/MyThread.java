package ThreadTest;

public class MyThread extends Thread{//无法继承其他类，只能继承thread类
    //重写线程类的run方法
    @Override
    public void run() {//run方法，在线程开启后，线程会自动调用run方法
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread输出：" + i);
        }
    }
}
