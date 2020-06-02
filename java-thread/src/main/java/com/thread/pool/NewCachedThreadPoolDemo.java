package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newCachedThreadPool
 * 创建一个可缓存线程空闲 60 秒的无界线程池，使用 SynchronousQueue 作为阻塞队列，这个队列比较特殊，只能存储一个元素。可缓存是如何理解呢，其实就是线程执行完任务后不立即销毁线程，而是在 60 秒内无需执行任务的情况下才销毁，适合处理大量耗时较短的任务场景
 *
 * @author jingLv
 * @date 2020-06-01 11:19 上午
 */
public class NewCachedThreadPoolDemo {

    public static class ThreadA implements Runnable {

        @Override
        public void run() {
            System.out.println("当前线程名称：" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(threadA);
        }
        executorService.shutdown();
    }
}
