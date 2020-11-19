package com.demo.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取方式二: 循环读取文件的数据
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class ReadMethodTwo {

    public ReadMethodTwo() {
    }

    public static void readFile(String fileName) {
        // 1. 找到目标文件
        File file = new File(fileName);
        // 2. 建立输入通道
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            // 3. 读取文件的数据
            //声明该遍历用于存储读取到的数据
            int content = 0;
            while ((content = fileInputStream.read()) != -1) {
                System.out.println((char) content);
            }
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
