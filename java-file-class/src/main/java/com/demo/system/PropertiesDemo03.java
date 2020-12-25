package com.demo.system;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author jingLv
 * @date 2020/12/23
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        // 把集合中的数据保存到文件
        // myStore();
        // 把文件中的数据加载到集合
        myLoad();
    }

    private static void myStore() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("number_001", "张三");
        properties.setProperty("number_002", "李四");
        properties.setProperty("number_003", "王五");
        // void store(Writer writer, String comments):将此属性列表（键和元素对）写入此Properties表中，以适合使用load(Reader)方法的格式写入输出字符流
        FileWriter fileWriter = new FileWriter("java-file-class/fw.txt");
        properties.store(fileWriter, null);
        // 释放资源
        fileWriter.close();
    }

    private static void myLoad() throws IOException {
        Properties properties = new Properties();
        // void load(Reader reader):从输入字符流读取属性列表（键和元素对）
        FileReader fileReader = new FileReader("java-file-class/fw.txt");
        properties.load(fileReader);
        fileReader.close();
        System.out.println(properties);
    }
}
