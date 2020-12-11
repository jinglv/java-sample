package com.demo.chars;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jingLv
 * @date 2020/12/11
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字符输入流对象
        FileReader fileReader = new FileReader("java-file-class/ConversionStreamDemo.java");
        // 根据目的地创建字符输出流对象
        FileWriter fileWriter = new FileWriter("java-file-class/CopyJavaFile.java");
        // 读写数据，复制文件
        // 一次读写一个字符数组数据
        char[] chars = new char[1024];
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
        }

        // 释放资源
        fileReader.close();
        fileWriter.close();
    }
}
