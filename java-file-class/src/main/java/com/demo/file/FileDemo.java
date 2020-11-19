package com.demo.file;

import java.io.File;

/**
 * @author jingLv
 * @date 2020/11/19
 */
public class FileDemo {

    public static void main(String[] args) {
        //File file = new File("F:\\a.txt");
        File file = new File("/Users/apple/JavaProject/java-sample" + File.separator + "hello.txt");
        //File parentFile = new File("F:\\");
        //File file = new File(parentFile,"a.txt");
        System.out.println("存在吗？" + file.exists());//exists判断该文件是否存在，存在返回true，否则返回false
        System.out.println("目录分隔符：" + File.separator);//目录分隔符：\
    }
}
