package com.thread.create;

/**
 * 通过Runnable接口的方式
 *
 * @author jingLv
 * @date 2020-05-26 11:14 上午
 */
public class ThreadForRunnable {
    public static class MyThread implements Runnable {
        public void run() {
            System.out.println("MyThread implements runnable");
        }
    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
    }
}
