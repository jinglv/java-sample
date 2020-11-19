package com.demo.file;

import java.io.File;

/**
 * 文件路径
 *
 * @author jingLv
 * @date 2020/11/19
 */
public class FileDemoPath {

    public static void main(String[] args) {
        File file = new File(".");
        System.out.println("当前路径的绝对路径：" + file.getAbsolutePath());

        File file2 = new File("..\\..\\a.txt");
        System.out.println("当前路径：" + file2.exists());
    }
}
