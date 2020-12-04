package com.demo.bytes;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流写数据的3种方式
 *
 * @author jingLv
 * @date 2020/12/01
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 创建字节流输出对象
        FileOutputStream fileOutputStream01 = new FileOutputStream("java-file-class/java01.txt");
        System.out.println("--------------字节流写入数据第一种---------------");
        // 第一种：void write(int b) 将指定的字节写入此文件输出流（一次写一个字节数据）
        fileOutputStream01.write(97);
        fileOutputStream01.write(98);
        fileOutputStream01.write(99);
        fileOutputStream01.write(100);
        fileOutputStream01.write(101);

        FileOutputStream fileOutputStream02 = new FileOutputStream("java-file-class/java02.txt");
        System.out.println("--------------字节流写入数据第二种---------------");
        // 第二种：void write(byte[] b) 将b.length字节从指定的字节数组写入此文件输出流（一次写一个字节数组数据）
        // 字节数组
        byte[] bytes01 = {97, 98, 99, 100, 101};
        fileOutputStream02.write(bytes01);

        FileOutputStream fileOutputStream03 = new FileOutputStream("java-file-class/java03.txt");
        System.out.println("--------------字节流写入数据第三种---------------");
        // 第三种：void write(byte[] b,int off, int len) 将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流（一次写一个字节数组的部分数据）
        byte[] bytes02 = {97, 98, 99, 100, 101};
        fileOutputStream03.write(bytes02, 0, bytes02.length);

        // 关闭资源
        fileOutputStream03.close();
    }
}
