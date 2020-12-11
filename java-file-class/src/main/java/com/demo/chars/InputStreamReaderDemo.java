package com.demo.chars;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jingLv
 * @date 2020/12/11
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("java-file-class/b.txt"));

        // int read() 一次读一个字符数据
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            System.out.print((char) ch);
        }

        // int read() 一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }

        // 释放资源
        inputStreamReader.close();
    }
}
