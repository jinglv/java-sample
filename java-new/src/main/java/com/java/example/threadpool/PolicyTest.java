package com.java.example.threadpool;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 饱和策略
 *
 * @author jingLv
 * @date 2020/11/05
 */
public class PolicyTest {

    /**
     * 线程池
     */
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(
            // 核心线程数和最大线程数
            2, 3,
            // 线程空闲后的存活时间
            60L, TimeUnit.SECONDS,
            // 有界阻塞队列
            new LinkedBlockingQueue<>(5));

    /**
     * 定义线程池中执行任务
     */
    class Task implements Runnable {

        /**
         * 任务名称
         */
        private String taskName;

        public Task(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println("线程[" + Thread.currentThread().getName() + "]正在执行[" + this.taskName + "]任务！");
            try {
                Thread.sleep(1000L * 5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程[" + Thread.currentThread().getName() + "]已执行完成[" + this.taskName + "]任务！");
        }
    }

    /**
     * 终止策略
     * 线程池的执行过程
     * 2个核心线程
     * 5个任务队列
     * 3个最大线程：除去2个核心线程，只有1个可用
     * <p>
     * 前2个任务，会占用2个核心线程
     * 第3个到第7个任务，会暂存到任务队列中
     * 第8个任务，会启动最大线程执行
     * 第9个任务，没有线程可以去执行
     */
    @Test
    public void abortPolicyTest() {
        // 设置饱和策略为终止策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        for (int i = 1; i <= 10; i++) {
            try {
                // 提交10个线程任务
                executor.execute(new Task("线程任务" + i));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        // 关闭线程池
        executor.shutdown();
    }

    /**
     * 抛弃策略
     * 执行结果，不会有线程任务9和10，抛弃最新的任务
     */
    @Test
    public void discardPolicyTest() {
        // 设置饱和策略为抛弃策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 1; i <= 10; i++) {
            try {
                // 提交10个线程任务
                executor.execute(new Task("线程任务" + i));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        // 关闭线程池
        executor.shutdown();
    }

    /**
     * 抛弃旧任务策略
     * 执行结果看到，会有线程任务9和10，而没有线程任务3和4，相对于9和10，3和4是暂存到任务队列中还未执行的旧的任务，就将3好4抛弃，执行9和10
     */
    @Test
    public void discardOldestPolicyTest() {
        // 设置饱和策略为抛弃旧任务策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 1; i <= 10; i++) {
            try {
                // 提交10个线程任务
                executor.execute(new Task("线程任务" + i));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        // 关闭线程池
        executor.shutdown();
    }

    /**
     * 调用者运行策略
     * 借助于调用者的主线程来运行要被提交到线程池中的任务
     * 调用者往线程池中提交任务，发现线程池有拒绝的情况或者已经超负载的情况，就会使用自己的线程（主线程）来执行任务运行，当执行完之后，再次尝试将其余的任务向线程池中提交
     */
    @Test
    public void callerRunsPolicyTest() {
        // 设置饱和策略为调用者运行策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 1; i <= 10; i++) {
            try {
                // 提交10个线程任务
                executor.execute(new Task("线程任务" + i));
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        // 关闭线程池
        executor.shutdown();
    }

    /**
     * 单元测试执行完，主线程等待100秒，防止主线程退出
     *
     * @throws InterruptedException
     */
    @AfterMethod

    public void after() throws InterruptedException {
        Thread.sleep(1000L * 10);
    }
}
