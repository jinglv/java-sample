package com.java.example.threadpool;

import org.testng.annotations.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author jingLv
 * @date 2020/11/03
 */
public class RunTest {

    @Test
    public void submitTest() {
        // 创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 利用submit方法提交任务，接收任务的返回结果
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(1000L * 10);
            return 2 * 5;
        });

        Integer num = 0;
        try {
            // 阻塞方法，直到任务有返回值后，才向下执行
            num = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("执行结果：" + num);
    }

    @Test
    public void executeTest() {
        // 创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 利用execute方法提交任务，没有返回结果
        executorService.execute(() -> {
            try {
                Thread.sleep(1000L * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Integer num = 2 * 5;
            System.out.println("执行结果：" + num);
        });

        try {
            Thread.sleep(1000L * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
