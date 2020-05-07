package com.java.algorithms.example.sort.bubble;

import com.java.algorithms.example.sort.SortTestHelper;
import com.java.algorithms.example.sort.Student;

/**
 * 冒泡排序
 * 冒泡排序（ Bubble Sort，台湾译为：泡沫排序或⽓泡排序）是⼀种简单的排序算法。它重复地⾛访过要排序的数列，⼀次⽐较两个元素，如果他们的顺序错误就把他们交换过来。
 * ⾛访数列的⼯作是重复地进⾏直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越⼤的元素会经由交换慢慢“浮”到数列的顶端，故名
 * <p>
 * 算法描述：
 * - i从0开始， i与 i+1⽐较，如果i>i+1 ，那么就互换
 * - i 不断增加，直到 i<n-1 （ n是数组元素的个数， n-1是数组已经最后⼀个元素） ，⼀趟下来，可以让数组元素中最⼤值排在数组的最后⾯
 *
 * @author jinglv
 * @date 2020-04-06 16:36
 */
public class BubbleSort {
    /**
     * 冒泡排序基础版
     *
     * @param arr 待排序数组
     * @return 返回已排序完成的数组
     */
    public static int[] bubbleSort(int[] arr) {
        // 数组的长度
        int l = arr.length;

        // 外层循环是排序的趟数
        for (int i = 0; i < l - 1; i++) {
            // 内层循环是当前趟数需要⽐较的次数
            for (int j = 0; j < l - i - 1; j++) {
                //前⼀位与后⼀位与前⼀位⽐较，如果前⼀位⽐后⼀位要⼤，那么交换
                if (arr[j] > arr[j + 1]) {
                    SortTestHelper.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序的升级版
     * 如果在一次循环过程中，没有发生交换，则表示已经排好序，则不需要再次进行遍历了
     *
     * @param arr 待排序的数组
     * @return 返回已排序完成的数组
     */
    public static int[] bubbleSortPlus(int[] arr) {
        // 数组的长度
        int l = arr.length;

        // 记录是否已经发生交换，0表示未发生交换，1表示已发生交换
        int isChange;

        // 外层循环是排序的趟数
        for (int i = 0; i < l - 1; i++) {

            // 每⽐较⼀趟就重新初始化为0
            isChange = 0;

            // 内层循环是当前趟数需要⽐较的次数
            for (int j = 0; j < l - i - 1; j++) {
                //前⼀位与后⼀位与前⼀位⽐较，如果前⼀位⽐后⼀位要⼤，那么交换
                if (arr[j] > arr[j + 1]) {
                    SortTestHelper.swap(arr, j, j + 1);

                    // 在完成数组元素交换后，记录已交换
                    isChange = 1;
                }
            }
            //如果⽐较完⼀趟没有发⽣置换，那么说明已经排好序了，不需要再执⾏下去了
            if (isChange == 0) {
                break;
            }

        }
        return arr;
    }

    /**
     * 冒泡排序的升级版
     *
     * @param arr 待排序的数组
     * @return 返回已完成排序的数组
     */
    public static int[] bubbleSortPlus2(int[] arr) {
        // 获取数组的长度
        int l = arr.length;

        // 定义一个布尔值hasChange，来记录每轮循环是否有发生交换
        boolean hasChange = true;

        for (int i = 0; i < l - 1 && hasChange; i++) {
            // 每一轮循环则，将hasChange置为false
            hasChange = false;
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortTestHelper.swap(arr, j, j + 1);
                    hasChange = true;
                }
            }
        }
        return arr;
    }

    /**
     * 对象排序
     *
     * @param studentComparable 待排序的对象集合
     */
    public static void bubbleSortStudent(Comparable<Student>[] studentComparable) {
        // 对象数组的长度
        int l = studentComparable.length;

        // 记录是否已经发生交换，0表示未发生交换，1表示已发生交换
        int isChange;

        // 外层循环是排序的趟数
        for (int i = 0; i < l - 1; i++) {

            // 每⽐较⼀趟就重新初始化为0
            isChange = 0;

            // 内层循环是当前趟数需要⽐较的次数
            for (int j = 0; j < l - i - 1; j++) {
                //前⼀位与后⼀位与前⼀位⽐较，如果前⼀位⽐后⼀位要⼤，那么交换
                if (studentComparable[j].compareTo((Student) studentComparable[j + 1]) > 0) {
                    SortTestHelper.swap(studentComparable, j, j + 1);

                    // 在完成数组元素交换后，记录已交换
                    isChange = 1;
                }
            }

            //如果⽐较完⼀趟没有发⽣置换，那么说明已经排好序了，不需要再执⾏下去了
            if (isChange == 0) {
                break;
            }
        }
    }
}
