package com.demo.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取方式四: 使用缓冲数组配合循环一起读取--效率高
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class ReadMethodFour {

    public ReadMethodFour() {
    }

    public static void readFile(String fileName) {
        // 1. 目标文件
        File file = new File(fileName);
        // 2. 建立数据通道
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            // 3. 读取文件
            //建立缓冲数组配合读取文件的数据
            //保存每次读取到的字节个数
            int length = 0;
            //存储读取到的数据缓冲数组的长度一般是1024的倍数，因为与计算机的处理单位。理论上缓冲数组越大，效率越高
            byte[] buf = new byte[1024 * 3];
            //read方法如果读取到了文件的末尾，那么会返回-1表示
            while ((length = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
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
