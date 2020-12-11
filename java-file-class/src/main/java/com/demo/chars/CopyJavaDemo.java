package com.demo.chars;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/11
 */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字符输入流对象
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("java-file-class/ConversionStreamDemo.java"));
        // 根据目的地创建字符输出流对象
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("java-file-class/CopyJavaFile.java"));
        // 读写数据，复制文件
        // 一次读取一个字符数据
//        int ch;
//        while ((ch = inputStreamReader.read()) != -1) {
//            outputStreamWriter.write(ch);
//        }

        // 一次读写一个字符数组数据
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            outputStreamWriter.write(chars, 0, len);
        }

        // 释放资源
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
