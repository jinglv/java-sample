package com.demo.chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author jingLv
 * @date 2020/12/14
 */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("java-file-class/names.txt"));
        // 2. 创建ArrayList集合对象
        ArrayList<String> names = new ArrayList<>();
        // 3. 调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // 4. 把读取到的字符串数据存储到集合中
            names.add(line);
        }
        // 5. 释放资源
        bufferedReader.close();
        // 6. 使用Random产生一个随机数，随机数的范围在：[0, 集合的长度)
        Random random = new Random();
        int index = random.nextInt(names.size());
        // 7. 把第6步产生的随机数作为索引到ArrayList集合中获取值
        String name = names.get(index);
        // 8. 把第7步得到的数据输出在控制台
        System.out.println("幸运者是：" + name);
    }
}
