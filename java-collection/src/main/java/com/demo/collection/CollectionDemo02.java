package com.demo.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author jingLv
 * @date 2020/12/24
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> c = new ArrayList<>();

        // boolean add(E e) : 添加元素
        System.out.println("集合中添加元素：" + c.add("hello"));
        System.out.println("集合中添加元素：" + c.add("world"));
        /**
         *     public boolean add(E e) {
         *         modCount++;
         *         add(e, elementData, size);
         *         return true;
         *     }
         *     查看源码：ArrayList的add方法，永远返回true，直接使用接口，不需要输出
         *
         */
        c.add("javase");

        // boolean remove(Object o):从集合中移除指定的元素
        System.out.println("移除集合中的元素（元素存在集合中）" + c.remove("world"));
        // 移除不存在的Linux，返回false
        System.out.println("移除集合中的元素（元素不存在集合中）" + c.remove("linux"));

        // void clear():清空集合中的元素
        // c.clear();

        // boolean contains(Object o):判断集合中是否存在指定的元素
        System.out.println(c.contains("集合中判断包含元素（元素存在集合中）：" + "hello"));
        // 判断包含不存在的Linux，返回false
        System.out.println("集合中判断包含元素（元素不存在集合中）：" + c.contains("linux"));

        // boolean isEmpty():判断集合是否为空
        System.out.println("是否为空（不为空返回false，为空返回true）：" + c.isEmpty());

        // int size():集合的长度，也就是集合中元素的个数
        System.out.println("集合的长度：" + c.size());

        // 输出集合对象
        System.out.println(c);
    }
}
