package com.demo.system;

import java.io.PrintStream;

/**
 * @author jingLv
 * @date 2020/12/21
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        // public static final PrintStream out:标准输出流，通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
        PrintStream printStream = System.out;

        // 能够方便地打印各种数据值
        // 同行
        printStream.print("hello");
        printStream.print(200);
        // 换行
        printStream.println("hello");
        printStream.println(100);

        // System.out的本质是一个字节输出流
        // 同行
        System.out.print("hello");
        System.out.print(200);
        // 换行
        System.out.println("hello");
        System.out.println(100);
    }
}
