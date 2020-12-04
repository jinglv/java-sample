package com.demo.bytes;

import java.io.*;

/**
 * 四种方式实现复制视频，并记录每种方式复制视频的时间
 * 1. 基本字节流一次读写一个字节
 * 2. 基本字节流一次读写一个字节数组
 * 3. 字节缓冲流一次读写一个字节
 * 4. 字节缓冲流一次读写一个字节数组
 *
 * @author jingLv
 * @date 2020/12/04
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long startTime = System.currentTimeMillis();
        // 复制视频方法一
        method1();
        // 复制视频方法二
        method2();
        // 复制视频方法三
        method3();
        // 复制视频方法四
        method4();
        // 记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }

    /**
     * 字节缓冲流一次读写一个字节数组
     */
    private static void method4() throws IOException {
        // 数据源
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(""));
        // 目的地
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(""));
        // 复制
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        // 释放资源
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /**
     * 字节缓冲流一次读写一个字节
     */
    private static void method3() throws IOException {
        // 数据源
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(""));
        // 目的地
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(""));
        // 复制
        int by;
        while ((by = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(by);
        }
        // 释放资源
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /**
     * 基本字节流一次读写一个字节数组
     */
    private static void method2() throws IOException {
        // 数据源
        FileInputStream fileInputStream = new FileInputStream("");
        // 目的地
        FileOutputStream fileOutputStream = new FileOutputStream("");
        // 复制
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        // 释放资源
        fileInputStream.close();
        fileOutputStream.close();
    }

    /**
     * 基本字节流一次读写一个字节
     */
    private static void method1() throws IOException {
        // 数据源
        FileInputStream fileInputStream = new FileInputStream("");
        // 目的地
        FileOutputStream fileOutputStream = new FileOutputStream("");
        // 复制
        int by;
        while ((by = fileInputStream.read()) != -1) {
            fileOutputStream.write(by);
        }
        // 释放资源
        fileInputStream.close();
        fileOutputStream.close();
    }

}
