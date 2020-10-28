package com.java.example.file;

/**
 * 文件处理函数式接口
 *
 * @author jingLv
 * @date 2020/10/27
 */
@FunctionalInterface
public interface FileConsumer {

    /**
     * 函数式接口抽象方法
     *
     * @param fileContent 文件内容字符串
     */
    void fileHandler(String fileContent);
}
