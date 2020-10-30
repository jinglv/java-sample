package com.java.example.resource;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 基于JDK7之后，实现正确关闭流资源方法
 * try - with - resource
 *
 * @author jingLv
 * @date 2020/10/30
 */
public class NewFileCopyTest {

    @Test
    public void copyFile() {
        //1 .创建输入输出流
        // 定义输入路径和输出路径
        String originalUrl = "/Users/apple/JavaProject/java-sample/java-new/src/main/resources/Interfaces.sql";
        String targetUrl = "/Users/apple/JavaProject/java-sample/java-new/src/main/resources/copyOne.sql";

        // 初始化输入/输出对象
        try (
                FileInputStream originalFileInputStream = new FileInputStream(originalUrl);
                FileOutputStream targetFileOutputStream = new FileOutputStream(targetUrl);
        ) {
            //2. 执行文件拷贝，读取文件内容，写入到另一个文件中
            // 读取的字节信息
            int content;

            // 迭代，读取/写入字节
            while ((content = originalFileInputStream.read()) != -1) {
                targetFileOutputStream.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
