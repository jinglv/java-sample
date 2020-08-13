package com.java.algorithms.example.recursion;

/**
 * 求和
 *
 * @author jinglv
 * @date 2020-04-12 13:22
 */
public class Sum {
    /**
     * 指定一个数，求该数以内数的和
     * <p>
     * for循环
     *
     * @param num 指定的数
     * @return 返回求和的数
     */
    public static int sumFor(int num) {
        // 初始化求和的变量
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * 指定一个数，求该数以内数的和
     * <p>
     * 递归
     * <p>
     * 递归表达式(规律)： 1+2+3+...+n ，这是⼀个求和的运算，那么我们可以假设X=1+2+3+...+n ，可以将 1+2+3+...+(n-1) 看成是⼀个整体。⽽这个整体做的事⼜和我们的初始⽬
     * 的(求和)相同。以我们的⾼中数学知识我们⼜可以将上⾯的式⼦看成 X=sum(n-1)+n
     * 递归出口：累加到只剩一个数
     *
     * @param num 指定的数
     * @return 返回求和的数
     */
    public static int sumRecursion(int num) {

        if (num == 1) {
            return num;
        } else {
            return sumRecursion(num - 1) + num;
        }
    }
}
