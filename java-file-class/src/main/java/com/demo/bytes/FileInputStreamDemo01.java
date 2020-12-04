package com.demo.bytes;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节流读取数据--一次读一个字节数据
 *
 * @author jingLv
 * @date 2020/12/02
 */
public class FileInputStreamDemo01 {

    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("java-file-class/javaHello.txt");
        // 调用字节输入流对象的数据方法
//        System.out.println("-------------第一次读取数据-------------");
//        // 第一次读取数据
//        // read()读取一个字节的数据,把读取的数据返回
//        int read = fileInputStream.read();
//        //不强转的话，输出的acsii
//        System.out.println((char) read);
//
//        System.out.println("-------------第二次读取数据-------------");
//        // 第二次读取数据，读取会将空格和换行也算一个字节
//        byte[] bytes = new byte[5];
//        int len = fileInputStream.read(bytes);
//        // String(byte[] bytes) 将字节数组转为字符串
//        System.out.println(new String(bytes));

        System.out.println("-------------第三次读取数据-------------");
        // 第三次读取数据
        byte[] bytes = new byte[5];
        int len = fileInputStream.read(bytes, 0, 5);
        System.out.println((char) len);

//        System.out.println("-------------循环读取数据-------------");
//        // 循环读取
//        // 长度需要1024的整数倍
//        byte[] bytes1 = new byte[1024];
//        int len1;
//        while ((len1 = fileInputStream.read()) != -1) {
//            // String(byte[] bytes, int offset, int length) 将字节数组一部分转为字符串
//            System.out.println(new String(bytes1, 0, len1));
//        }

        // 释放资源
        fileInputStream.close();
    }
}
