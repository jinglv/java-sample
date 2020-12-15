package com.demo.chars;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class BufferedStreamDemo02 {

    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/bw.txt"));
        // 写数据
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello:" + i);
            // bufferedWriter.write("\n");
            bufferedWriter.newLine();
        }
        // 释放资源
        bufferedWriter.close();

        // 创建字符缓冲输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/bw.txt"));
        // 读取一行文字
//        String line = bufferedReader.readLine();
//        System.out.println(line);
//
//        line = bufferedReader.readLine();
//        System.out.println(line);
//
//        line = bufferedReader.readLine();
//        System.out.println(line);
        // 标准输出方式
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 释放资源
        bufferedReader.close();
    }
}
