package com.demo.chars;

import java.nio.charset.StandardCharsets;

/**
 * 字符集中的编码解码问题
 *
 * @author jingLv
 * @date 2020/12/11
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("java-file-class/a.txt"), StandardCharsets.UTF_8);
        outputStreamWriter.write("你好");
        outputStreamWriter.close();

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("java-file-class/a.txt"));
        // 一次读取一个字符数据
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            System.out.print((char) ch);
        }
        inputStreamReader.close();
    }
}
