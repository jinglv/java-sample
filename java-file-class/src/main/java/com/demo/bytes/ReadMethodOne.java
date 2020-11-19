package com.demo.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取方式一: FileInputStream的read()方法读取
 * 缺陷：无法读取完整一个文件的数据（淘汰）
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class ReadMethodOne {

    public ReadMethodOne() {
    }

    public static void readFile(String fileName) {
        // 1. 找到目标文件
        File file = new File(fileName);
        // 2. 建立数据的输入通道
        // 初始化输入流
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            // 3. 读取文件中的数据
            //read()读取一个字节的数据,把读取的数据返回
            int content = fileInputStream.read();
            //不强转的话，输出的acsii
            System.out.println("读到的内容是：" + (char) content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 关闭资源
        try {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
