package com.demo.set;

import java.util.TreeSet;

/**
 * @author jingLv
 * @date 2021/01/05
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<Integer> treeSet = new TreeSet<>();
        // 添加元素
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(20);
        // 重复元素，不会添加
        treeSet.add(50);
        // 遍历集合
        for (Integer integer : treeSet) {
            // 输出是有序的
            System.out.println(integer);
        }
    }
}
