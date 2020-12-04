package com.demo.bytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流写数据加异常处理
 *
 * @author jingLv
 * @date 2020/12/01
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
        // finally实现释放资源
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("");
            fileOutputStream.write("hello".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
