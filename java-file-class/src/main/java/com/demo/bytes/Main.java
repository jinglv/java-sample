package com.demo.bytes;

/**
 * @author jingLv
 * @date 2020/11/19
 */
public class Main {
    public static void main(String[] args) {
        byte[] bytes = {'h', 'e', 'l', 'l', 'o'};
        // String(byte[] bytes) 将字节数组转为字符串
        System.out.println(new String(bytes));
        // String(byte[] bytes, int offset, int length) 将字节数组一部分转为字符串
        System.out.println(new String(bytes, 0, 3));
    }
}
