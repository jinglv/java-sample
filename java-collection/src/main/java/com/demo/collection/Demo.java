package com.demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jingLv
 * @date 2020/12/24
 */
public class Demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        String str = "hello";
        c.add(str);
        c.add("world");

        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
