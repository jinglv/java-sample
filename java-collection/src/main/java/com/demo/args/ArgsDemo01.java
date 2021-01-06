package com.demo.args;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class ArgsDemo01 {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        // 接下来5个数组求和，6个数字求和……n个数字求和，我们需要写n个求和方法吗？
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
    }

    /**
     * 可变参数方法
     *
     * @param a
     * @return
     */
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    /**
     * 注意：方法多个参数，且包含可变参数，参数要放到后面
     *
     * @param b
     * @param a
     * @return
     */
//    public static int sum(int b, int... a) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

/*    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

}
