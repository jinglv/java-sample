package com.java.algorithms.example.structure.recursion;

/**
 * 斐波那契数列
 * 斐波那契数列张这个样子的:{1 1 2 3 5 8 13 21 34 55 ... n}
 * 规律：前两项之和等于第三项
 * 递归出口：因为是前两项加起来才得出来第三项，则n=1和n=2就是递归出口
 *
 * @author jingLv
 * @date 2020-06-24 3:58 下午
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
