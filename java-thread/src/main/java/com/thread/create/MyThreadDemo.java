package com.thread.create;

/**
 * @author jingLv
 * @date 2020/11/12
 */
public class MyThreadDemo {

    public static void main(String[] args) {
        // 创建两个线程对象
        MyTread tread1 = new MyTread();
        MyTread tread2 = new MyTread();

        tread1.start();
        tread2.start();
    }
}
