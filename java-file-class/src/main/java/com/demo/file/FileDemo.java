package com.demo.file;

import java.io.File;

/**
 * @author jingLv
 * @date 2020/11/19
 */
public class FileDemo {

    public static void main(String[] args) {
        File file = new File("java.txt");
        // 文件删除
        System.out.println(file.delete());

        // 创建目录(单目录)
        File file1 = new File("test");
        System.out.println(file1.mkdir());
        // 删除目录
        System.out.println(file1.delete());

        // 创建目录(多级目录)
        File file2 = new File("mulTest/test.txt");
        System.out.println(file2.mkdirs());
        // 删除目录,只会删除目录下的文件
        System.out.println(file2.delete());
    }
}
