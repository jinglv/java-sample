package com.demo.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文本文件
 *
 * @author jingLv
 * @date 2020/12/02
 */
public class CopyTxtDemo {

    public static void main(String[] args) throws IOException {
        // 根据数据源创建字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("java-file-class/javaHello.txt");
        // 根据目的地创建输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("java-file-class/javaHelloCopy.txt");
        // 读写数据，复制文本（一次读取一个字节，一次写入一个字节）
        int by;
        while ((by = fileInputStream.read()) != -1) {
            fileOutputStream.write(by);
        }
        // 资源释放
        fileInputStream.close();
        fileOutputStream.close();
    }
}
