package com.demo.set;

import java.util.LinkedHashSet;

/**
 * @author jingLv
 * @date 2021/01/05
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        // 添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        // 重复元素，则不会添加到集合
        linkedHashSet.add("world");
        // 遍历集合
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
