package com.demo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingLv
 * @date 2020/12/29
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        String[] strings = {"hello", "world", "java"};
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("--------------------");
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        // 内部原理是一个Iterator迭代器
        for (String s : list) {
            if (s.equals("world")) {
                list.add("javaee");
            }
        }
        // 抛出了异常：ConcurrentModificationException 并发修改异常 由此可见增强for内部是一个Iterator迭代器
    }
}
