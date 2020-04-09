package com.java.algorithms.example.sort;

/**
 * 排序需要的辅助工具
 *
 * @author jinglv
 * @date 2020-04-06 16:16
 */
public class SortTestHelper {

    /**
     * 随机生成一个int数组
     *
     * @param n     数组的个数
     * @param left  数组范围的最小值
     * @param right 数组范围的最大值
     * @return 返回随机生成的数组
     */
    public static int[] generateRandomArray(int n, int left, int right) {
        if (left > right) {
            return null;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (right - left + 1) + right);
        }
        return arr;
    }

    /**
     * int数组中，两个值交换
     *
     * @param arr 数组
     * @param i   需要交换的前一个下标
     * @param j   需要交换的后一个下标
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 对象数组，元素交换
     *
     * @param arr 数组
     * @param i 需要交换的前一个下标
     * @param j 需要交换的后一个下标
     */
    public static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
