package com.demo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingLv
 * @date 2020/12/28
 */
public class ListDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        // 遍历集合，得到每一个元素，查看是否有"world"这个元素，如果有，就在集合中添加"javaee"元素
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            // 抛出异常：ConcurrentModificationException
//            String s = it.next();
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {
                list.add("javaee");
            }
        }
        // 输出集合对象
        System.out.println(list);
    }
}
