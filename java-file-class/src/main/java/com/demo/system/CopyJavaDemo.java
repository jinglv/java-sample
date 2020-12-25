package com.demo.system;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/22
 */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
//        // 1. 根据数据源创建字符输入流对象
//        BufferedReader br = new BufferedReader(new FileReader(""));
//        // 2. 根据目的地创建自如输出流对象
//        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
//        // 3. 读写数据，复制文件
//        String line;
//        while ((line = br.readLine()) != null) {
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//        // 4. 释放资源
//        br.close();
//        bw.close();

        System.out.println("------------字符打印流改进-------------");
        // 1. 根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader(""));
        // 2. 根据目的地创建自如输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter(""));
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        // 4. 释放资源
        br.close();
        pw.close();
    }
}
