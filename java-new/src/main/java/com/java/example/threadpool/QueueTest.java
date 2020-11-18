package com.java.example.threadpool;

import org.testng.annotations.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author jingLv
 * @date 2020/11/03
 */
public class QueueTest {

    /**
     * 基于数组的有界队列，队列容量为10
     * 添加到10个元素后，队列就会阻塞
     */
    @Test
    public void testArrayBlockingQueue() {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        // 循环向队列添加值
        for (int i = 0; i < 20; i++) {
            try {
                queue.put(i);
                System.out.println("向队列中添加值：" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 基于链表的有界/无界队列，队列容量为10
     * 有界--添加到10个元素后，队列就会阻塞
     */
    @Test
    public void testLinkedBlockingQueue() {
        // 有界
        // LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
        // 无界
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();


        // 循环向队列添加值
        for (int i = 0; i < 20; i++) {
            try {
                queue.put(i);
                System.out.println("向队列中添加值：" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 同步移交队列
     * 没有存储元素的能力，每个插入的操作必须要等到另个一线程调用移除操作才能成功，否则插入的操作一直处于阻塞状态
     */
    @Test
    public void test() {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // 插入值
        new Thread(() -> {
            try {
                queue.put(1);
                System.out.println("插入成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // 从队列中删除值
        new Thread(() -> {
            try {
                queue.take();
                System.out.println("删除成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
