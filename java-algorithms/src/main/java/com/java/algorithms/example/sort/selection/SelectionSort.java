package com.java.algorithms.example.sort.selection;

import com.java.algorithms.example.sort.common.SortTestHelper;
import com.java.algorithms.example.sort.common.Student;

/**
 * 选择排序
 * 选择排序(Selection sort)是⼀种简单直观的排序算法。
 * ⼯作原理是每⼀次从待排序的数据元素中选出最⼩(或最⼤)的⼀个元素，存放在序列的起始(末尾)位置，直到全部待排序的数据元素排完。
 * <p>
 * 规律：
 * - ⼀个数组是需要 n-1 趟排序的(因为直到剩下⼀个元素时，才不需要找最⼤值)
 * - 每交换1次，再次找最⼤值时就将范围缩⼩1
 * - 查询当前趟数最⼤值实际上不⽤知道最⼤值是多少(上⾯我查出最⼤值，还要我⼿动数它的⻆标)，知道它的数组⻆标即可，交换也是根据⻆标来进⾏交换
 *
 * @author jingLv
 * @date 2020-04-07 11:02 AM
 */
public class SelectionSort {
    /**
     * 选择排序
     *
     * @param arr 待排序数组
     * @return 返回已排序完成的数组
     */
    public static int[] selectionSort(int[] arr) {
        // 数组的长度
        int l = arr.length;

        // 记录当前趟数的最⼤值的⻆标
        int pos;

        //外层循环控制需要排序的趟数
        for (int i = 0; i < l - 1; i++) {
            //新的趟数、将⻆标重新赋值为0
            pos = 0;
            //内层循环控制遍历数组的个数并得到最⼤数的⻆标
            for (int j = 0; j < l - i; j++) {
                if (arr[j] > arr[pos]) {
                    pos = j;
                }
            }

            SortTestHelper.swap(arr, pos, l - 1 - i);
        }
        return arr;
    }

    /**
     * 对象排序
     *
     * @param comparables 待排序的对象集合
     */
    public static void selectionSortStudent(Comparable<Student>[] comparables) {
        // 对象数组的长度
        int l = comparables.length;
        // 记录当前趟数的最大值的角标
        int pos;
        // 外层需要控制排序的趟数
        for (int i = 0; i < l - 1; i++) {
            // 每一轮新的循环，将角标重新赋值为0
            pos = 0;
            for (int j = 0; j < l - i; j++) {
                if (comparables[j].compareTo((Student) comparables[pos]) > 0) {
                    pos = j;
                }
            }
            SortTestHelper.swap(comparables, pos, l - 1 - i);
        }
    }
}
