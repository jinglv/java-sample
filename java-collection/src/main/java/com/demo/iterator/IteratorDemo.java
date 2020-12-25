package com.demo.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jingLv
 * @date 2020/12/24
 */
public class IteratorDemo {

    public static void main(String[] args) {
        // 创建Collection结合的对象
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        // iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();
        // E next() :返回迭代中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        // 已经没有元素遍历了
//        System.out.println(it.next());
        /*
         * 抛出了异常：java.util.NoSuchElementException：表示被请求的元素不存在
         */

        // boolean hasNext(): 如果迭代具有更多元素，则返回true
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        // 输出空
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }

        // 循环改进遍历集合
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
