package com.demo.chars;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class BufferedStreamCopyDemo {

    public static void main(String[] args) throws IOException {
        // 1.根据数据源创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/ConversionStreamDemo.java"));
        // 2.根据目的地创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/CopyJavaFile.java"));
        // 3.读写数据，复制文件
        // 一次读写一个字符数据
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            bufferedWriter.write(ch);
        }

        // 一次读写一个字符数组
        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(new String(chars, 0, len));
        }
        // 4.释放资源
        bufferedReader.close();
        bufferedWriter.close();
    }

}
