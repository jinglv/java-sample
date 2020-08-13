package com.java.algorithms.example.sort.insertion;

import com.java.algorithms.example.sort.common.Student;

/**
 * 插入排序
 * 插⼊排序的基本操作就是将⼀个数据插⼊到已经排好序的有序数据中，从⽽得到⼀个新的、个数加⼀的有序数据，算法适⽤于少量数据的排序，时间复杂度为O(n^2)。是稳定的排序⽅法。
 * <p>
 * 规律：
 * - ⾸先将已排序的数据看成⼀个整体
 * - ⼀个数组是需要 n-1 趟排序的，总是⽤后⼀位跟 已排序的数据 ⽐较(第⼀趟：第⼆位跟 已排序的数据 ⽐，第⼆趟：第三位跟 已排序的数据 ⽐）
 * - ⽤第三位和 已排序的数据 ⽐，实际上就是让第三位数跟两个数⽐较，只不过这两个数是已经排好序的⽽已。⽽正是因为它排好序的，我们可以使⽤⼀个循环就可以将我们⽐较的数据插⼊进去
 *
 * @author jingLv
 * @date 2020-04-07 5:19 PM
 */
public class InsertionSort {
    /**
     * 插入排序
     *
     * @param arr 待排序数组
     * @return 返回已排序完成的数组
     */
    public static int[] insertionSort(int[] arr) {
        // 获取数组的长度
        int l = arr.length;

        int temp;

        for (int i = 1; i < l; i++) {
            // 设置当前值
            temp = arr[i];

            //获取前一位的下标
            int j = i - 1;
            //如果前⼀位(已排序的数据)⽐当前数据要⼤，那么就进⼊循环⽐较
            while (j >= 0 && arr[j] > temp) {
                //当前位元素赋值当前位的后一位元素
                arr[j + 1] = arr[j];

                //不断往前，直到退出循环
                j--;
            }
            //退出了循环说明找到了合适的位置了，将当前数据插⼊合适的位置中
            arr[j + 1] = temp;
        }
        return arr;
    }

    /**
     * 对象排序
     *
     * @param comparables 待排序的对象数组
     */
    public static void insertionSortStudent(Comparable<Student>[] comparables) {
        // 获取数组长度
        int l = comparables.length;

        Comparable temp;
        for (int i = 1; i < l; i++) {
            temp = comparables[i];

            int j = i - 1;
            while (j >= 0 && comparables[j].compareTo((Student) temp) > 0) {
                comparables[j + 1] = comparables[j];

                j--;
            }
            comparables[j + 1] = temp;
        }
    }
}