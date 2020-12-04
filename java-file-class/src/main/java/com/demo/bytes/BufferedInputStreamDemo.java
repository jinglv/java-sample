package com.demo.bytes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author jingLv
 * @date 2020/12/04
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 字节缓冲输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("java-file-class/test.txt"));
        // 一次读取一个字节数组
/*        int by;
        while ((by = bufferedInputStream.read()) != -1) {
            System.out.println((char) by);
        }*/

        // 一次读取一个字节数组数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        // 释放资源
        bufferedInputStream.close();
    }
}
