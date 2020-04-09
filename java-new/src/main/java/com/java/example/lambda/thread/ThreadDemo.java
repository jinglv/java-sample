package com.java.example.lambda.thread;

/**
 * @author jingLv
 * @date 2020-04-08 5:36 PM
 */
public class ThreadDemo {

    public static void main(String[] args) {
        // 1.传统模式下，新线程的创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable threading..." + Thread.currentThread().getId());
            }
        }).start();

        // 2.jdk8新特性，lambda表达式优化线程模式
        new Thread(() -> System.out.println("lambda threading..." + Thread.currentThread().getId())).start();
    }
}
