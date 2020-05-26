package com.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过 Callable 和 Future 两个接口的方式
 *
 * @author jingLv
 * @date 2020-05-26 11:16 上午
 */
public class ThreadForCallableAndFuture {
    public static class MyThread implements Callable {

        public Object call() throws Exception {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "MyThread for callable";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myThread);
        new Thread(futureTask).start();
        //此处阻塞等待线程执行完毕
        System.out.println("结果：" + futureTask.get());
    }
}
