package com.demo.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jingLv
 * @date 2020/12/31
 */
public class SetDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        // HashSet对集合的迭代顺序不作任何保证
        Set<String> set = new HashSet<>();
        // 添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        // 遍历
        for (String s : set) {
            System.out.println(s);
        }
    }
}
