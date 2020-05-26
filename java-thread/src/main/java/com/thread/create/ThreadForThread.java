package com.thread.create;

/**
 * 通过继承Thread类
 *
 * @author jingLv
 * @date 2020-05-26 11:12 上午
 */
public class ThreadForThread {
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("MyThread extends thread");
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
