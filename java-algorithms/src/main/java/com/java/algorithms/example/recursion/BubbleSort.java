package com.java.algorithms.example.recursion;

/**
 * 冒泡排序递归写法
 * 递归的思想来进行改造：
 * - 当第一趟排序后，我们可以将数组最后一位（R）和数组签名的数（L,R-1）进行切割，数组前面的数（L,R-1）看成是一个整体，这个整体又是和我们的初始目的（找出最大值，与当前趟数的末尾处交换）是一样的
 * - 递归出口：当只有一个元素时，即不用比较了：L==R
 *
 * @author jingLv
 * @date 2020/06/24
 */
public class BubbleSort {

    /**
     * 递归的冒泡排序
     *
     * @param arr 待排序的数组
     * @param l   数组最左边的下标
     * @param r   数组最右边的下标
     */
    public static void bubbleSort(int[] arr, int l, int r) {
        int temp;

        // 如果只有一个元素，啥也不用干
        if (l == r) {
        } else {
            for (int i = l; i < r; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            // 第一趟排序后已经将最大值放到数组最后面了

            // 接下来是排序"整体"的数据了
            bubbleSort(arr, l, r - 1);
        }
    }
}
