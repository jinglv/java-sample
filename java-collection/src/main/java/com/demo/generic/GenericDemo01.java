package com.demo.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        // 创建集合对象，如果不指定类型，则默认为是Object
        Collection c = new ArrayList();
        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add(100);
        // 遍历集合
        Iterator it = c.iterator();
        while (it.hasNext()) {
//            Object o = it.next();
//            System.out.println(o);
            String s = (String) it.next();
            // 转换异常报错：java.lang.ClassCastException: java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
            System.out.println(s);
        }
    }
}
