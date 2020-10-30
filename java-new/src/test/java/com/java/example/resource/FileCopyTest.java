package com.java.example.resource;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之前的文件拷贝功能
 *
 * @author jingLv
 * @date 2020/10/30
 */
public class FileCopyTest {

    @Test
    public void copyFile() {
        //1 .创建输入输出流
        // 定义输入路径和输出路径
        String originalUrl = "/Users/apple/JavaProject/java-sample/java-new/src/main/resources/Interfaces.sql";
        String targetUrl = "/Users/apple/JavaProject/java-sample/java-new/src/main/resources/copy.sql";
        // 声明文件输入流，文件输出流
        FileInputStream originalFileInputStream = null;
        FileOutputStream targetFileOutputStream = null;

        try {
            // 实例化文件流对象
            originalFileInputStream = new FileInputStream(originalUrl);
            targetFileOutputStream = new FileOutputStream(targetUrl);

            //2. 执行文件拷贝，读取文件内容，写入到另一个文件中
            // 读取的字节信息
            int content;

            // 迭代，读取/写入字节
            while ((content = originalFileInputStream.read()) != -1) {
                targetFileOutputStream.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3. 关闭文件流资源
            if (targetFileOutputStream != null) {
                try {
                    targetFileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (originalFileInputStream != null) {
                try {
                    originalFileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
