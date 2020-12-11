package com.demo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020/12/07
 */
public class StringDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 定义一个字符串
        String str = "中国";
        // byte[] getBytes():使用平台（IDE）的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        byte[] bys1 = str.getBytes();
        System.out.println(Arrays.toString(bys1));
        // 输出结果： [-28, -72, -83, -27, -101, -67]

        // byte[] getBytes (String charsetName):使用指定的字符集将给String编码为一系列字节，将结果存储到新的字节数组中
        byte[] bys2 = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bys2));
        // 输出结果：[-28, -72, -83, -27, -101, -67]

        byte[] bys3 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bys3));
        // 输出结果：[-42, -48, -71, -6]

        // String(byte[] bytes):通过使用平台（IDE）的默认字符集解码指定的字节数组来构造新的String
        String s1 = new String(bys1);
        System.out.println(s1);
        // 输出结果：中国

        //  String(byte[] bytes, String charsetName):通过指定的字符集解码指定的字节数组来构造新的String
        String s2 = new String(bys2, StandardCharsets.UTF_8);
        System.out.println(s2);
        // 输出结果：中国

        String s3 = new String(bys3, StandardCharsets.UTF_8);
        System.out.println(s3);
        // 输出结果：�й� (乱码)
    }
}
