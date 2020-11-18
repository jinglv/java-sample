package com.thread.create;

/**
 * @author jingLv
 * @date 2020/11/12
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 打印出当前线程的名字
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
