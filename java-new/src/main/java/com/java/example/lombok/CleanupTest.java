package com.java.example.lombok;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Cleanup注解，生成对资源关闭的操作代码
 *
 * @author jingLv
 * @date 2020/11/06
 */
public class CleanupTest {

    public void copyFile(String in, String out) throws IOException {
        @Cleanup FileInputStream fileInputStream = new FileInputStream(in);
        @Cleanup FileOutputStream fileOutputStream = new FileOutputStream(out);

        int r;

        while ((r = fileInputStream.read()) != -1) {
            fileOutputStream.write(r);
        }
    }
}
