package com.java.example.lambda.performance;

import java.util.*;

/**
 * Lambda和Stream性能问题
 *
 * @author jingLv
 * @date 2020-04-21 1:28 PM
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        // 1.基本数据类型：整数
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            integerList.add(random.nextInt(Integer.MAX_VALUE));
        }

        // 处理性能从以下几个方面查看
        // 1) Stream
        testStream(integerList);
        // 2) parallelStream
        testParallelStream(integerList);
        // 3) 普通for
        testForLoop(integerList);
        // 4) 增强型for
        testStrongForLoop(integerList);
        // 5) 迭代器
        testIterator(integerList);

        System.out.println("------------------------------------");

        // 2.复杂数据类型：对象
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            products.add(new Product("pro" + i, i, random.nextInt(Integer.MAX_VALUE)));
        }

        // 处理性能从以下几个方面查看
        // 1) Stream
        testProductStream(products);
        // 2) parallelStream
        testProductParallelStream(products);
        // 3) 普通for
        testProductForLoop(products);
        // 4) 增强型for
        testProductStrongForLoop(products);
        // 5) 迭代器
        testProductIterator(products);
    }

    public static void testStream(List<Integer> list) {
        long start = System.currentTimeMillis();

        Optional optional = list.stream().max(Integer::compareTo);
        System.out.println(optional.get());

        long end = System.currentTimeMillis();
        System.out.println("testStream:" + (end - start) + "ms");
    }

    public static void testParallelStream(List<Integer> list) {
        long start = System.currentTimeMillis();

        Optional optional = list.parallelStream().max(Integer::compareTo);
        System.out.println(optional.get());

        long end = System.currentTimeMillis();
        System.out.println("testParallelStream:" + (end - start) + "ms");
    }

    public static void testForLoop(List<Integer> list) {
        long start = System.currentTimeMillis();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);

        long end = System.currentTimeMillis();
        System.out.println("testForLoop:" + (end - start) + "ms");
    }

    public static void testStrongForLoop(List<Integer> list) {
        long start = System.currentTimeMillis();

        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);

        long end = System.currentTimeMillis();
        System.out.println("testStrongForLoop:" + (end - start) + "ms");
    }

    public static void testIterator(List<Integer> list) {
        long start = System.currentTimeMillis();

        Iterator<Integer> integerIterator = list.iterator();
        int max = integerIterator.next();

        while (integerIterator.hasNext()) {
            int current = integerIterator.next();
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);

        long end = System.currentTimeMillis();
        System.out.println("testIterator:" + (end - start) + "ms");
    }

    public static void testProductStream(List<Product> list) {
        long start = System.currentTimeMillis();

        Optional optional = list.stream().max((p1, p2) -> p1.getHot() - p2.getHot());
        System.out.println(optional.get());

        long end = System.currentTimeMillis();
        System.out.println("testProductStream:" + (end - start) + "ms");
    }

    public static void testProductParallelStream(List<Product> list) {
        long start = System.currentTimeMillis();

        Optional optional = list.parallelStream().max((p1, p2) -> p1.getHot() - p2.getHot());
        System.out.println(optional.get());

        long end = System.currentTimeMillis();
        System.out.println("testProductParallelStream:" + (end - start) + "ms");
    }

    public static void testProductForLoop(List<Product> list) {
        long start = System.currentTimeMillis();

        Product maxHot = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            Product current = list.get(i);
            if (current.getHot() > maxHot.getHot()) {
                maxHot = current;
            }
        }
        System.out.println(maxHot);

        long end = System.currentTimeMillis();
        System.out.println("testProductForLoop:" + (end - start) + "ms");
    }

    public static void testProductStrongForLoop(List<Product> list) {
        long start = System.currentTimeMillis();

        Product maxHot = list.get(0);
        for (Product product : list) {
            if (product.getHot() > maxHot.getHot()) {
                maxHot = product;
            }
        }
        System.out.println(maxHot);

        long end = System.currentTimeMillis();
        System.out.println("testProductStrongForLoop:" + (end - start) + "ms");
    }

    public static void testProductIterator(List<Product> list) {
        long start = System.currentTimeMillis();

        Iterator<Product> integerIterator = list.iterator();
        Product maxHot = integerIterator.next();

        while (integerIterator.hasNext()) {
            Product current = integerIterator.next();
            if (current.getHot() > maxHot.getHot()) {
                maxHot = current;
            }
        }
        System.out.println(maxHot);

        long end = System.currentTimeMillis();
        System.out.println("testProductIterator:" + (end - start) + "ms");
    }
}
