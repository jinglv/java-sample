package com.java.algorithms.example.sort.selection;

import com.java.algorithms.example.sort.common.SortTestHelper;
import com.java.algorithms.example.sort.common.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-04-07 11:33 AM
 */
public class SelectionSortTest {

    private int[] arr = SortTestHelper.generateRandomArray(10, 1, 20);

    @Test
    public void testSelectionSort() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = SelectionSort.selectionSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(beforeArr));
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }

    @Test
    public void testSelectionStudentSort() {
        Student[] arr = new Student[4];
        arr[0] = new Student("D", 82);
        arr[1] = new Student("C", 60);
        arr[2] = new Student("B", 72);
        arr[3] = new Student("A", 58);

        SelectionSort.selectionSortStudent(arr);
        System.out.println(Arrays.toString(arr));
    }
}