package com.demo.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author jingLv
 * @date 2021/01/05
 */
public class TreeSetDemo05 {
    public static void main(String[] args) {
        // 创建Set集合对象
        // 最终输出数据不会排序
        // Set<Integer> set = new HashSet<>();
        // 最终输出数据会排序
        Set<Integer> set = new TreeSet<>();
        // 创建随机数对象
        Random r = new Random();
        // 判断集合的长度是不是小于10
        while (set.size() < 10) {
            // 产生一个随机数，添加到集合
            int number = r.nextInt(20) + 1;
            set.add(number);
        }
        // 遍历集合
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
