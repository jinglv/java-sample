package com.demo.bytes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author jingLv
 * @date 2020/12/04
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 字节缓冲输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("java-file-class/test.txt"));
        // 写入数据
        bufferedOutputStream.write("hello\r".getBytes());
        bufferedOutputStream.write("world\r".getBytes());
        // 释放资源
        bufferedOutputStream.close();
    }
}
