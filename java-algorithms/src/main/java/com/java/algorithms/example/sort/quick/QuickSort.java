package com.java.algorithms.example.sort.quick;

import com.java.algorithms.example.sort.SortTestHelper;
import com.java.algorithms.example.sort.Student;

/**
 * 快速排序
 * 快速排序由C. A. R. Hoare在1962年提出。
 * 它的基本思想是：通过⼀趟排序将要排序的数据分割成独⽴的两部分，其中⼀部分的所有数据都⽐另外⼀部分的所有数据都要⼩，然后再按此⽅法对这
 * 两部分数据分别进⾏快速排序，整个排序过程可以递归进⾏，以此达到整个数据变成有序序列
 * <p>
 * 思路：
 * 在数组中找⼀个⽀点(任意),经过⼀趟排序后，⽀点左边的数都要⽐⽀点⼩，⽀点右边的数都要⽐⽀点⼤！
 * 分成的左右两边，又单独看成数组，在数组中找到支点再次进行比较，以此类推，跟之前的做法是一致的只是参数不同，则可采用递归，直到数组只剩一个元素
 * 递归出⼝：如果数组只有⼀个元素时，那么就不⽤排序了
 *
 * @author jingLv
 * @date 2020-04-08 11:01 AM
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * @param arr   待排序的数组
     * @param left  指向数组第一个元素
     * @param right 指向数组最后一个元素
     * @return 返回已排好序的数组
     */
    public static int[] quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;

        // 在数组中找到支点
        int pivot = arr[(i + j) / 2];

        // 只要最左边与最右边不相等则一直循环
        while (i <= j) {
            //寻找比支点大的值
            while (pivot > arr[i]) {
                i++;
            }

            //寻找比支点小的值
            while (pivot < arr[j]) {
                j--;
            }

            //分别找到了⽐⽀点⼩的数(右边)、⽐⽀点⼤的数(左边)，它们进⾏交换
            if (i <= j) {
                SortTestHelper.swap(arr, i, j);
                i++;
                j--;
            }
        }

        //“左边”再做排序，直到左边剩下⼀个数(递归出⼝)
        if (left < j) {
            quickSort(arr, left, j);
        }

        //“右边”再做排序，直到右边剩下⼀个数(递归出⼝)
        if (i < right) {
            quickSort(arr, i, right);
        }

        return arr;
    }


    /**
     * 快速排序--对象排序
     *
     * @param comparables 待排序的数组
     * @param left        指向数组的第一个元素
     * @param right       指向数组的最后一个元素
     */
    public static void quickSortStudent(Comparable<Student>[] comparables, int left, int right) {
        int i = left;
        int j = right;

        Comparable<Student> pivot = comparables[(i + j) / 2];

        while (i <= j) {
            while (pivot.compareTo((Student) comparables[i]) > 0) {
                i++;
            }
            while (pivot.compareTo((Student) comparables[j]) < 0) {
                j--;
            }
            if (i <= j) {
                SortTestHelper.swap(comparables, i, j);
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSortStudent(comparables, left, j);
        }
        if (i < right) {
            quickSortStudent(comparables, i, right);
        }
    }
}
