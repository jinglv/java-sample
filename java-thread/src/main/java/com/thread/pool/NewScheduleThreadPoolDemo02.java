package com.thread.pool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * newScheduleThreadPool
 * 方式二：延后 1 秒后定时执行
 * 创建一个延时或者延时后定时执行的固定工作线程数量的线程池，定时执行类似于 Timer，适合定时处理任务场景
 *
 * @author jingLv
 * @date 2020-06-01 11:24 上午
 */
public class NewScheduleThreadPoolDemo02 {

    public static class TaskA implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程A当前时间（s）：" + time2Date(System.currentTimeMillis() / 1000));
        }
    }

    public static class TaskB implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程B当前时间（s）：" + time2Date(System.currentTimeMillis() / 1000));
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        System.out.println("主线程当前时间（s）：" + time2Date(System.currentTimeMillis() / 1000));
        scheduledExecutorService.scheduleAtFixedRate(new Thread(new NewScheduleThreadPoolDemo02.TaskA()), 1,3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Thread(new NewScheduleThreadPoolDemo02.TaskB()), 1,3, TimeUnit.SECONDS);
    }

    private static String time2Date(long seconds) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date(Long.parseLong(seconds + "0000")));
    }
}
