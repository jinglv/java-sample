package com.demo.system;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author jingLv
 * @date 2020/12/22
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        // PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自定执行刷新
        PrintWriter printWriter = new PrintWriter("java-file-class/pw.txt");
        printWriter.write("hello");
        // 换行
        printWriter.write("/r");
        printWriter.flush();
        printWriter.write("world");
        printWriter.flush();

        // println相当于write数据及换行
        printWriter.println("hello");
        printWriter.flush();

        // PrintWriter(Writer out, boolean autoFlush): 创建一个新的PrintWriter
        // 第二个参数为true--实现自动刷新
        PrintWriter pw = new PrintWriter(new FileWriter("java-file-class/pw.txt"), true);
        pw.println("hello");
        // 释放资源
        printWriter.close();
        pw.close();
    }
}
