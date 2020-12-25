package com.demo.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author jingLv
 * @date 2020/12/21
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        // public static final InputStream in:标准输入流，通常该流对应键盘输入或由主机环境或用户指定的另一个输入源
        // 通常该流对应键盘输入
//        InputStream inputStream = System.in;
        // 字节流读数据
//        int by;
//        while ((by = inputStream.read()) != -1) {
//            System.out.println((char) by);
//        }

        // 字符流读数据
        // 如何把字节流转换为字符流？使用转换流
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        // 使用字符流能不能够实现一次读取一行数据呢？可以
        // 但是，一次读取一行数据方式是字符缓冲输入流的特有方法
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String readLine = bufferedReader.readLine();
        System.out.println("输入的字符串是：" + readLine);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println("输入的整数是：" + i);

        // 自己实现键盘录入太麻烦，所以Java提供了一个类实现键盘输入Scanner
        Scanner scanner = new Scanner(System.in);
    }
}
