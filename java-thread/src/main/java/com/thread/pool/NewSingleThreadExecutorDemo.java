package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newSingleThreadExecutor
 * 创建只有一个线程的线程池，即使用单线程串行执行所有任务，这种方式适合需要顺序执行任务的场景
 *
 * @author jingLv
 * @date 2020-06-01 11:10 上午
 */
public class NewSingleThreadExecutorDemo {

    public static class TaskA implements Runnable {
        @Override
        public void run() {
            System.out.println("this is taskA");
        }
    }

    public static class TaskB implements Runnable {
        @Override
        public void run() {
            System.out.println("this is taskB");
        }
    }

    public static class TaskC implements Runnable {
        @Override
        public void run() {
            System.out.println("this is taskC");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Thread(new TaskA()));
        executorService.execute(new Thread(new TaskB()));
        executorService.execute(new Thread(new TaskC()));
    }
}
