package com.demo.chars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建ArrayList集合
        ArrayList<String> strings = new ArrayList<>();
        // 2. 往集合中存储字符串元素
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        // 3. 创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java-file-class/array.txt"));
        // 4. 遍历集合，得到每一个字符串数据
        for (String string : strings) {
            // 5. 调用字符缓冲输出流对象的方法写数据
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        // 6. 释放资源
        bufferedWriter.close();
    }
}
