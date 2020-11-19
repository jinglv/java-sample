package com.demo.bytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写入方法一：每次只能写一个字节的数据出去
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class WriteOne {

    public WriteOne() {
    }

    public static void writeFile(String fileName) {
        // 1. 找到目标文件, 如果文件不存在，则会新建
        File file = new File(fileName);
        // 2. 建立数据输出通道
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            // 3. 写入数据
            fileOutputStream.write('h');
            fileOutputStream.write('e');
            fileOutputStream.write('l');
            fileOutputStream.write('l');
            fileOutputStream.write('o');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4. 关闭资源
        try {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
