package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newFixedThreadPool
 * 创建一个固定线程量的线程池，初始化时需要确定线程数量，执行任务时从线程池中拿，假如执行的任务数比较多，达到了线程初始化时数量，则会缓存到一个无界（即没有长度限制）的阻塞队列中
 *
 * @author jingLv
 * @date 2020-06-01 11:14 上午
 */
public class NewFixedThreadPoolDemo {

    public static class TaskA implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this is task A");
        }
    }

    public static class TaskB implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this is task B");
        }
    }

    public static class TaskC implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this is task C");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Thread(new NewFixedThreadPoolDemo.TaskA()));
        executorService.execute(new Thread(new NewFixedThreadPoolDemo.TaskB()));
        executorService.execute(new Thread(new NewFixedThreadPoolDemo.TaskC()));
    }
}
