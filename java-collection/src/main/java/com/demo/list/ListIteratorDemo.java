package com.demo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jingLv
 * @date 2020/12/29
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
//        // 通过List集合的listIterator()方法得到
//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()) {
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("---------------");
//        // 逆向遍历
//        while (lit.hasPrevious()) {
//            String s = lit.previous();
//            System.out.println(s);
//        }

        // 获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                // 添加成功了
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
