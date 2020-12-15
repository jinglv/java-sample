package com.demo.chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/array.txt"));
        // 2. 创建ArrayList集合对象
        ArrayList<String> strings = new ArrayList<>();
        // 3. 调用字符缓冲输入流对象的方法读取数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // 4. 把读取到的字符串数据存储到集合中
            strings.add(line);
        }
        // 5. 释放资源
        bufferedReader.close();
        // 6. 遍历集合
        strings.forEach(System.out::println);
    }
}
