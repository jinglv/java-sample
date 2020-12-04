package com.demo.bytes;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流写数据的两个小问题
 * - 字节流写数据如何实现换行
 * - 字节流写数据如何实现追加
 *
 * @author jingLv
 * @date 2020/12/01
 */
public class FileOutputStreamDemo03 {

    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("java-file-class/javaHello.txt", true);
        //写数据
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("hello".getBytes());
            fileOutputStream.write("\r".getBytes());
        }
        //释放资源
        fileOutputStream.close();
    }
}
