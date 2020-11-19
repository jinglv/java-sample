package com.demo.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取方式三: 使用缓冲数组读取。缺点：无法读取完整一个文件的数据（淘汰）
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class ReadMethodThree {

    public ReadMethodThree() {
    }

    public static void readFile(String fileName) {
        // 1. 找到目标文件
        File file = new File(fileName);
        // 2. 建立输入的输入通道
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            // 3. 建立缓冲字节，读取文件的数据
            //相当于超市里面的购物车
            byte[] buf = new byte[3];
            //数据已经存储到了字节数组中，如果使用read方法读取输入传入字节数组，那么数据是存储到字节数组中的，而这时候read方法的返回值是表示的是本次读取了几个字节数据到字节数组中。
            int length = fileInputStream.read(buf);
            System.out.println("length:" + length);
            //使用字节数组构建字符串, 避免因为字节数组分配过大，而构建的字符串会有过多的空格
            String content = new String(buf, 0, length);
            System.out.println("内容：" + content);
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
