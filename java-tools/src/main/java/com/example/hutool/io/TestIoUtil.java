package com.example.hutool.io;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 测试Hutool中的IO
 *
 * @author jinglv
 * @date 2020/10/06
 */
public class TestIoUtil {

    /**
     * 原始文件拷贝
     */
    @Test
    void testCopyFile() throws IOException {
        // 文件输出流
        FileInputStream is = new FileInputStream(new File("/Users/jinglv/IdeaProjects/java-sample/java-tools/src/main/resources/test.txt"));
        // 文件输入流
        FileOutputStream os = new FileOutputStream(new File("/Users/jinglv/IdeaProjects/java-sample/java-tools/src/main/resources/test_copy.txt"));

        // 定义缓冲区
        byte[] b = new byte[1024];
        int len = 0;
        while (true) {
            len = is.read(b);
            if (len == -1) break;
            os.write(b, 0, len);
        }
        // 关闭流
        is.close();
        os.close();
    }

    /**
     * 使用IOUtil进行文件拷贝
     */
    @Test
    void testCopyFileForIOUtil() {
        BufferedInputStream in = FileUtil.getInputStream("/Users/jinglv/IdeaProjects/java-sample/java-tools/src/main/resources/test.txt");
        BufferedOutputStream out = FileUtil.getOutputStream("/Users/jinglv/IdeaProjects/java-sample/java-tools/src/main/resources/test_copy_io.txt");
        IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);
    }
}
