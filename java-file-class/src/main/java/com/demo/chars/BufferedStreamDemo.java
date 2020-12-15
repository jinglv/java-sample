package com.demo.chars;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
//        // 字符缓冲流写数据
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/bw.txt"));
        // 构造函数默认字符长度8192
        bufferedWriter.write("hello");
        bufferedWriter.write("world");
        bufferedWriter.close();

        // 字符流读数据
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/bw.txt"));
        // 一次读取一个字符数据
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            System.out.println((char) ch);
        }

        // 一次读取一个字符数组数据
        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        bufferedReader.close();
    }
}
