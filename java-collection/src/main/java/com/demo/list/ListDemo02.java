package com.demo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingLv
 * @date 2020/12/28
 */
public class ListDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        //  void add(int index, E element) 在此集合中的指定位置插入指定的元素
        list.add(1, "javaee");
        // IndexOutOfBoundsException 索引越界
        // list.add(11, "se");

        // E remove(int index) 删除指定索引出的元素，返回被删除的元素
        System.out.println(list.remove(1));
        // IndexOutOfBoundsException 索引越界
        // System.out.println(list.remove(11));

        // E set(int index, E element) 修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1, "javase"));

        // E get(int index) 返回指定索引处的元素
        System.out.println(list.get(1));

        // 输出集合对象
        System.out.println(list);

        // for循环改进遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
