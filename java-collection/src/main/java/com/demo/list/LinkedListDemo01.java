package com.demo.list;

import java.util.LinkedList;

/**
 * @author jingLv
 * @date 2020/12/30
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedList<String> strings = new LinkedList<>();
        // 添加元素
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        // 遍历
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
