package com.demo.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取方式一
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
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            // 3. 读取数据
            //声明该遍历用于存储读取到的数据
            int content = 0;
            while ((content = fileReader.read()) != -1) {
                System.out.println((char) content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 关闭资源
        try {
            if (fileReader != null) {
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
