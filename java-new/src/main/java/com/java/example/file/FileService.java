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
     * 通过url获取本地文件内容，调用函数式接口处理
     *
     * @param url          文件内容
     * @param fileConsumer 文件处理函数式接口
     */
    public void fileHandle(String url, FileConsumer fileConsumer) throws IOException {
        // 创建文件读取流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(url)));

        // 定义行变量和内容sb
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        // 循环读取文件内容
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line + "\n");
        }

        // 调用函数式接口方法，将文件内容传递给lambda表达式，实现业务逻辑
        fileConsumer.fileHandler(stringBuilder.toString());
    }
}
