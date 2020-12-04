package com.thread;

/**
 * @author jingLv
 * @date 2020/12/01
 */
public class SynchronizedDemo {

    // synchronized修饰非静态方法
    public synchronized void function() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000L);
            System.out.println("function running......");
        }
    }

    // synchronized修饰静态方法
    public static synchronized void staticFunction() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000L);
            System.out.println("Static function running......");
        }
    }

    public static void main(String[] args) {
        final SynchronizedDemo demo = new SynchronizedDemo();
        //创建线程执行静态方法
        Thread thread1 = new Thread(() -> {
            try {
                staticFunction();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // 创建线程执行实例方法
        Thread thread2 = new Thread(() -> {
            try {
                demo.function();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 启动
        thread1.start();
        thread2.start();
    }
}
