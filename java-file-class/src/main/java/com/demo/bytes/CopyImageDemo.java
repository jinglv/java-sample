package com.demo.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制图片
 *
 * @author jingLv
 * @date 2020/12/02
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字节输入流对象
        FileInputStream inputStream = new FileInputStream("java-file-class/image.png");
        // 根据目的地创建字节输出流对象
        FileOutputStream outputStream = new FileOutputStream("java-file-class/imageCopy.png");
        // 读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        // 释放资源
        inputStream.close();
        outputStream.close();
    }
}
