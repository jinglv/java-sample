package com.demo.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author jingLv
 * @date 2020/12/24
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        // 创建Collection结合的对象
        Collection<String> c = new ArrayList<>();

        // 添加元素：boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");

        // 输出集合对象
        System.out.println(c);
    }
}
