package com.demo.file;

import java.io.File;

/**
 * @author jingLv
 * @date 2020/11/30
 */
public class RecursionDemo {
    public static void main(String[] args) {
        File srcFile = new File("/Users/apple/JavaProject/java-sample/java-file-class");
        // 调用方法
        factorialFile(srcFile);
    }

    /**
     * 递归遍历目录
     *
     * @param srcFile
     */
    public static void factorialFile(File srcFile) {
        // 获取给定的file目录下所有的文件或者目录的file数组
        File[] files = srcFile.listFiles();
        // 遍历该file数组，得到每一个File对象
        if (files != null) {
            for (File file : files) {
                // 判断file是否是目录
                if (file.isDirectory()) {
                    //是：递归调用
                    factorialFile(file);
                } else {
                    // 不是，获取绝对路径输出
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
