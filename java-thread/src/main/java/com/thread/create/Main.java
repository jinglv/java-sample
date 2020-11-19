package com.thread.create;

/**
 * @author jingLv
 * @date 2020/11/18
 */
public class Main {

    /**
     * 买票过程，多个线程卖100张票
     */
    public static class TicketDemo implements Runnable {
        // 100张票
        private int tickets = 100;
        Object obj = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            // 线程睡半秒
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " sale: " + tickets--);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketDemo ticketDemo = new TicketDemo();
        // 启动三个线程出售100张票
        Thread thread1 = new Thread(ticketDemo);
        Thread thread2 = new Thread(ticketDemo);
        Thread thread3 = new Thread(ticketDemo);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
