package com.demo.system;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author jingLv
 * @date 2020/12/22
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream(String fileName):使用指定的文件名创建新的打印流
        PrintStream printStream = new PrintStream("java-file-class/ps.txt");
        // 写数据
        // 字节输出流有的方法
        // 字节转码，97转为a
        printStream.write(97);
        // 使用特有方法写数据
        // 97就是97，不会做转码操作
        printStream.print(97);
        printStream.println(98);
        // 释放资源
        printStream.close();
    }
}
