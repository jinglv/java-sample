package com.java.example.lambda.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 线程安全问题
 *
 * @author jingLv
 * @date 2020/04/21
 */
public class Test {
    public static void main(String[] args) {
        // 整数列表
        List<Integer> lists = new ArrayList<>();
        // 增加数据
        for (int i = 0; i < 1000; i++) {
            lists.add(i);
        }

        // 串行stream
        List<Integer> list1 = new ArrayList<>();
        lists.stream().forEach(x -> list1.add(x));
        System.out.println(lists.size());
        System.out.println(list1.size());

        // 并行stream, 不安全会丢失数据
        List<Integer> list2 = new ArrayList<>();
        lists.parallelStream().forEach(x -> list2.add(x));
        System.out.println(list2.size());

        // 如果采用并行流，则采用以下方式
        List<Integer> list3 = lists.parallelStream().collect(Collectors.toList());
        System.out.println(list3.size());
    }
}
