package com.java.example.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文件服务类
 *
 * @author jingLv
 * @date 2020/10/27
 */
public class FileService {

    /**
     * 传统方式，通过url获取本地文件内容，调用函数式接口处理
     *
     * @param url          文件内容
     * @param fileConsumer 文件处理函数式接口
     */
    public void oldFileHandle(String url, FileConsumer fileConsumer) {
        // 声明
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            // 创建文件读取流
            fileInputStream = new FileInputStream(url);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            // 定义行变量和内容sb
            String line;
            StringBuilder stringBuilder = new StringBuilder();

            // 循环读取文件内容
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            // 调用函数式接口方法，将文件内容传递给lambda表达式，实现业务逻辑
            fileConsumer.fileHandler(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 新的方式，通过url获取本地文件内容，调用函数式接口处理
     *
     * @param url          文件内容
     * @param fileConsumer 文件处理函数式接口
     */
    public void newFileHandle(String url, FileConsumer fileConsumer) {
        try (
                // 声明、创建文件的读取流
                FileInputStream fileInputStream = new FileInputStream(url);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        ) {
            // 定义行变量和内容sb
            String line;
            StringBuilder stringBuilder = new StringBuilder();

            // 循环读取文件内容
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            // 调用函数式接口方法，将文件内容传递给lambda表达式，实现业务逻辑
            fileConsumer.fileHandler(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
