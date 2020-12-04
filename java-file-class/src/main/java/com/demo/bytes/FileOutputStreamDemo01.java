package com.demo.bytes;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream：文件输出流用于将数据写入File
 * <p>
 * - FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
 *
 * @author jingLv
 * @date 2020/12/01
 */
public class FileOutputStreamDemo01 {

    public static void main(String[] args) throws IOException {
        // 创建字节流输出对象
        FileOutputStream fileOutputStream = new FileOutputStream("java-file-class/java.txt");
        // void write (int b)：将指定的字节流写入次文件输出流
        // 字节97 表示字符 a
        fileOutputStream.write(97);
        // 释放资源
        fileOutputStream.close();
    }
}
