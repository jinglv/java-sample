package com.thread.lock;

/**
 * 线程死锁Demo
 * methodA持有锁1并想获得锁2
 * methodB持有锁2并想获得锁1
 * 此时两个线程一直等待，但谁也不释放各自的锁，就产生了死锁
 *
 * @author jingLv
 * @date 2020-05-26 11:44 上午
 */
public class ThreadLock {
    private final Object object1 = new Object();
    private final Object object2 = new Object();

    public void methodA() throws InterruptedException {
        synchronized (object1) {
            Thread.sleep(1000);
            synchronized (object2) {
                System.out.println("methodA()执行完毕");
            }
        }
    }

    public void methodB() throws InterruptedException {
        synchronized (object2) {
            Thread.sleep(1000);
            synchronized (object1) {
                System.out.println("methodB()执行完毕");
            }
        }
    }

    public static class ThreadA extends Thread {
        private final ThreadLock threadLock;

        public ThreadA(ThreadLock threadLock) {
            this.threadLock = threadLock;
        }

        public void run() {
            try {
                threadLock.methodA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadB extends Thread {
        private final ThreadLock threadLock;

        public ThreadB(ThreadLock threadLock) {
            this.threadLock = threadLock;
        }

        public void run(){
            try {
                threadLock.methodB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadLock threadLock = new ThreadLock();
        ThreadA threadA = new ThreadA(threadLock);
        ThreadB threadB = new ThreadB(threadLock);
        threadA.start();
        threadB.start();
        while(true);
    }
}
