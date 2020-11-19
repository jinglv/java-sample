package com.demo.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文件方式二：使用缓冲字符数组读取文件
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class ReadMethodTwo {

    public ReadMethodTwo() {
    }

    public static void readFile(String fileName) {
        // 1.找到目标文件
        File file = new File(fileName);
        // 2.建立数据的输入通道
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            // 3.读取文件
            //建立缓冲字符数组读取文件数据
            char[] buf = new char[1024];
            int length = 0;
            while ((length = fileReader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4.关闭资源
        try {
            if (fileReader != null) {
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
