package com.thread.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 通过线程池方式的方式
 *
 * @author jingLv
 * @date 2020-05-26 11:25 上午
 */
public class ThreadForThreadPool {
    public static class MyThread implements Runnable {

        public void run() {
            System.out.println("线程名：" + Thread.currentThread().getName() + ", 输出：MyThread for thread pool");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(myThread);
        }
        executorService.shutdown();
    }
}
