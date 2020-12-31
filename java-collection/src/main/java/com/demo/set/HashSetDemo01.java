package com.demo.set;

import java.util.HashSet;

/**
 * @author jingLv
 * @date 2020/12/31
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        HashSet<String> hs = new HashSet<>();
        // 添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");
        // 遍历
        for (String h : hs) {
            System.out.println(h);
        }
    }
}
