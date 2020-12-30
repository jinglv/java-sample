package com.demo.list;

import java.util.LinkedList;

/**
 * @author jingLv
 * @date 2020/12/30
 */
public class LinkedListDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedList<String> strings = new LinkedList<>();
        // 添加元素
        strings.add("hello");
        strings.add("world");
        strings.add("java");

        // public void addFirst(E e) 在该列表开头插入指定的元素
        strings.addFirst("javase");
        // public void addLast(E e) 将指定的元素追加到此列表的末尾
        strings.addLast("javaee");

        // public E getFirst() 返回此列表中的第一个元素
        System.out.println(strings.getFirst());
        // public E getLast() 返回此列表中的最后一个元素
        System.out.println(strings.getLast());

        // public E removeFirst() 从此列表中删除并返回第一个元素
        System.out.println(strings.removeFirst());
        // public E removeLast() 从此列表中删除并返回最后一个元素
        System.out.println(strings.removeLast());

        // 输出集合对象
        System.out.println(strings);
    }
}
