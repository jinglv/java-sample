package com.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jingLv
 * @date 2020-06-01 12:04 下午
 */
public class ThreadPoolExecutorDemo {
    public static class TaskA implements Runnable {
        private String name;

        public TaskA(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(this.name + "-运行中");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50));
        poolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new TaskA("任务-" + i);
            poolExecutor.execute(runnable);
        }
        poolExecutor.shutdown();
    }
}
