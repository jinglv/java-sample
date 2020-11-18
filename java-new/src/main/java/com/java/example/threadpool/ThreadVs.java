package com.java.example.threadpool;

import org.testng.annotations.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jingLv
 * @date 2020/11/02
 */
public class ThreadVs {

    /**
     * 新的处理方式
     */
    @Test
    public void newHandle() {
        // 开启了一个线程池：线程个数是10个
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        // 使用循环来模拟许多用户请求的场景
        for (int request = 1; request < 100; request++) {
            threadPool.execute(() -> {
                System.out.println("文档处理开始！");
                try {
                    // 将Word转换为PDF格式：处理时长很差的耗时过程
                    Thread.sleep(1000L * 30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("文档处理结束！");
            });
        }

        try {
            Thread.sleep(1000L * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 老的处理方式
     */
    @Test
    public void oldHandle() {
        // 使用循环来模拟许多用户请求的场景
        for (int request = 1; request < 100; request++) {
            new Thread(() -> {
                System.out.println("文档处理开始！");
                try {
                    // 将Word转换为PDF格式：处理时长很差的耗时过程
                    Thread.sleep(1000L * 30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("文档处理结束！");
            }).start();
        }

        try {
            Thread.sleep(1000L * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
