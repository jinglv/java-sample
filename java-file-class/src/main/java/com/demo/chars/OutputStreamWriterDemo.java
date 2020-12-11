package com.demo.chars;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author jingLv
 * @date 2020/12/11
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("java-file-class/b.txt"));
        // void write(int c):写一个字符
        outputStreamWriter.write(97);

        // 刷新流，将内容写入到文件中
        outputStreamWriter.flush();

        // void write(char[] cbuf):写入一个字符数组
        char[] chs = {'a', 'b', 'c', 'e'};
        outputStreamWriter.write(chs);

        // void write(char[] cbuf, int off, int len) 写入字符数组的一部分
        outputStreamWriter.write(chs, 0, chs.length);
        outputStreamWriter.write(chs, 1, 3);

        // void write(String str):写入一个字符
        outputStreamWriter.write("abcde");

        // void write(String str, int off, int len):写一个字符串的一部分
        outputStreamWriter.write("abcde", 1, 3);

        // 释放资源，释放资源之前会刷新流
        outputStreamWriter.close();
    }
}
