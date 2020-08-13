package com.java.algorithms.example.sort.quick;

import com.java.algorithms.example.sort.common.SortTestHelper;
import com.java.algorithms.example.sort.common.Student;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-04-08 11:26 AM
 */
public class QuickSortTest {

    private int[] arr = SortTestHelper.generateRandomArray(10, 1, 20);

    @Test
    public void testQuickSort() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = QuickSort.quickSort(arr, 0, arr.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(beforeArr));
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }

    @Test
    public void testQuickSortStudent() {
        Student[] arr = new Student[4];
        arr[0] = new Student("D", 82);
        arr[1] = new Student("C", 60);
        arr[2] = new Student("B", 72);
        arr[3] = new Student("A", 58);

        QuickSort.quickSortStudent(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}