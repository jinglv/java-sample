package com.java.algorithms.example.sort.merge;

/**
 * 归并排序
 * 归并排序（ MERGE-SORT）是建⽴在归并操作上的⼀种有效的排序算法,该算法是采⽤分治法（ Divide and Conquer）的⼀个⾮常典型的应⽤。将已有序的⼦序列合并，得到完全有序的序
 * 列；即先使每个⼦序列有序，再使⼦序列段间有序。 若将两个有序表合并成⼀个有序表，称为⼆路归并
 * <p>
 * 过程描述
 * 归并过程为：⽐较a[i]和b[j]的⼤⼩，若a[i]≤b[j]，则将第⼀个有序表中的元素a[i]复制到r[k]中，并令i和k分别加上1；否则将第⼆个有序表中的元素b[j]复制到r[k]中，并令j和k分别加上1，如此循
 * 环下去，直到其中⼀个有序表取完，然后再将另⼀个有序表中剩余的元素复制到r中从下标k到下标t的单元。归并排序的算法我们通常⽤递归实现，先把待排序区间[s,t]以中点⼆分，接着把左边
 * ⼦区间排序，再把右边⼦区间排序，最后把左区间和右区间⽤⼀次归并操作合并成有序的区间[s,t]。
 * <p>
 * 归并操作的⼯作原理如下：
 * 第⼀步：申请空间，使其⼤⼩为两个已经排序序列之和，该空间⽤来存放合并后的序列
 * 第⼆步：设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 第三步：⽐较两个指针所指向的元素，选择相对⼩的元素放⼊到合并空间，并移动指针到下⼀位置
 * 重复步骤3直到某⼀指针超出序列尾
 * 将另⼀序列剩下的所有元素直接复制到合并序列尾
 * <p>
 * 将两个已排好序的数组合并成⼀个有序的数组,称之为归并排序
 * 步骤：遍历两个数组，⽐较它们的值。谁⽐较⼩，谁先放⼊⼤数组中，直到数组遍历完成
 *
 * @author jingLv
 * @date 2020/04/08
 */
public class MergeSort {

    /**
     * 归并排序
     *
     * @param arr   待排序的数组
     * @param left  指向数组第⼀个元素
     * @param right 指向数组最后⼀个元素
     * @return 已完成排序的数组
     */
    public static int[] mergeSort(int[] arr, int left, int right) {
        //数组只有一个元素直接返回
        if (left == right) {
            return arr;
        } else {
            //取中间的数，进⾏拆分
            int middle = (left + right) / 2;
            //左边的数不断进⾏拆分
            mergeSort(arr, left, middle);
            //右边的数不断进行拆分
            mergeSort(arr, middle + 1, right);
            // 合并
            merge(arr, left, middle + 1, right);
        }
        return arr;
    }

    /**
     * 合并数组
     *
     * @param arr    数组
     * @param left   指向数组第⼀个元素
     * @param middle 指向数组分隔的元素
     * @param right  指向数组最后的元素
     */
    public static void merge(int[] arr, int left, int middle, int right) {
        // 拆分数组，定义左边的数组及大小
        int[] leftArr = new int[middle - left];
        //拆分数组，定义右边的数组及大小
        int[] rightArr = new int[right - middle + 1];
        //填充数据
        /*for (int i = left; i < middle; i++) {
            leftArr[i - left] = arr[i];
        }*/
        System.arraycopy(arr, left, leftArr, 0, middle - left);
        /*for (int i = middle; i <= right; i++) {
            rightArr[i - middle] = arr[i];
        }*/
        System.arraycopy(arr, middle, rightArr, 0, right + 1 - middle);
        int i = 0, j = 0;
        // 记录arr数组的第一个元素
        int k = left;
        //⽐较这两个数组的值，哪个⼩，就往数组上放
        while (i < leftArr.length && j < rightArr.length) {
            //谁⽐较⼩，谁将元素放⼊⼤数组中,移动指针，
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        //如果左边的数组还没⽐较完，右边的数都已经完了，那么将左边的数抄到⼤数组中(剩下的都是⼤数字)
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        //如果右边的数组还没⽐较完，左边的数都已经完了，那么将右边的数抄到⼤数组中(剩下的都是⼤数字)
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
