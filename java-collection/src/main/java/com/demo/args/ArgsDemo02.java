package com.demo.args;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        // public static <T> List<T> asList(T...a)：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");

        // java.lang.UnsupportedOperationException
        // list.add("javaee");

        // java.lang.UnsupportedOperationException: remove
        // list.remove("world");

        // 修改成功，添加、删除操作会修改list的大小，修改不会，因为会成功
        list.set(1, "javaee");

        System.out.println(list);

        System.out.println("--------------------");
        // public static <E> List<E> of(E...elements)：返回包含任何数量元素的不可变列表
        List<String> strings = List.of("hello", "world", "java", "world");

        // java.lang.UnsupportedOperationException
        // strings.add("javaee");

        // java.lang.UnsupportedOperationException
        // strings.remove("world");

        // java.lang.UnsupportedOperationException
        // strings.set(1, "javaee");

        System.out.println(strings);

        System.out.println("--------------------");
        // public static <E> Set <E> of(E...elements)：返回一个包含任意数量元素的不可变集合
        // set集合中重复元素，异常报错：java.lang.IllegalArgumentException: duplicate element: world
        // Set<String> set = Set.of("hello", "world", "java", "world");

        Set<String> set = Set.of("hello", "world", "java");

        // java.lang.UnsupportedOperationException
        // set.add("javaee");

        // java.lang.UnsupportedOperationException
        // set.remove("world");

        System.out.println(set);
    }
}
