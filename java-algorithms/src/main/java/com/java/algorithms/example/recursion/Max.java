package com.java.algorithms.example.recursion;

/**
 * @author jinglv
 * @date 2020/04/12
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

    /**
     * 求数组总最大的数
     * 递归实现
     *
     * @param arrays 指定的数组
     * @param l      数组左边的下标
     * @param r      数组右边的下标
     * @return 返回数组中最大的值
     */
    public static int findMax(int[] arrays, int l, int r) {
        // 如果该数组只有一个数，则最大值就是该数组第一个值了
        if (l == r) {
            return arrays[l];
        } else {
            int a = arrays[l];
            // 找出整体最大值
            int b = findMax(arrays, l + 1, r);

            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }
}
