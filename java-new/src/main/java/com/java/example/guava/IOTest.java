package com.java.example.guava;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * 演示如何使用流（Source）与汇（Sink）来对文件进行常用操作
 *
 * @author jingLv
 * @date 2020/11/02
 */
public class IOTest {

    @Test
    public void copyFile() {
        // 1. 创建对应的source和sink
        CharSource charSource = Files.asCharSource(new File("/Users/apple/JavaProject/java-sample/java-new/src/main/resources/Interfaces.sql"), Charsets.UTF_8);
        CharSink charSink = Files.asCharSink(new File("/Users/apple/JavaProject/java-sample/java-new/src/main/resources/target.sql"), Charsets.UTF_8);

        // 2. 拷贝
        try {
            charSource.copyTo(charSink);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
