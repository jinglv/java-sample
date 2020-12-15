package com.demo.chars;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class BufferedStreamCopyDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. 根据数据源创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/ConversionStreamDemo.java"));
        // 2. 根据目的地创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/CopyJavaFile.java"));
        // 3. 读写数据，复制文件 使用字符缓冲流特有功能实现
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // 写数据三步骤，如果没有后两行，会把所有内容写到一行中
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        // 4. 释放资源
        bufferedReader.close();
        bufferedWriter.close();
    }
}
