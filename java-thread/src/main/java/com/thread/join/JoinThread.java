package com.thread.join;

/**
 * 线程合并
 *
 * @author jingLv
 * @date 2020-05-26 11:33 上午
 */
public class JoinThread extends Thread {

    public static class ThreadA extends Thread {
        public void run() {
            System.out.println("this is threadA");
        }
    }

    public static class ThreadB extends Thread {
        public void run() {
            System.out.println("this is threadB");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadA.join();
        threadB.start();
        System.out.println("this is main");
    }
}
