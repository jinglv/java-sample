package com.thread.create;

/**
 * @author jingLv
 * @date 2020/11/12
 */
public class MyRunnableDemo {

    public static void main(String[] args) {
        // 创建Runnable类的对象
        MyRunnable myRunnable = new MyRunnable();
        // 带参构造方法给线程起名字
        Thread thread1 = new Thread(myRunnable, "线程1");
        Thread thread2 = new Thread(myRunnable, "线程2");

        // 设置守护线程
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        // 打印当前线程的名字
        System.out.println(Thread.currentThread().getName());
    }
}
