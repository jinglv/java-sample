package com.java.algorithms.example.structure.recursion;

/**
 * @author jinglv
 * @date 2020-04-12 13:36
 */
public class Max {
    /**
     * 求数组中最大的数
     * <p>
     * for循环
     *
     * @param arr 指定的数组
     * @return 返回数组中最大的值
     */
    public static int maxFor(int[] arr) {
        // 获取数组的长度
        int l = arr.length;

        // 假设数组中第一个元素是最大的值
        int max = arr[0];

        // 循环数组
        for (int value : arr) {
            // 判断数组元素的值大于max，则将arr[i] 赋值给max
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
