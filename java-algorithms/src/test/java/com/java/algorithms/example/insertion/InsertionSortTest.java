package com.java.algorithms.example.insertion;

import com.java.algorithms.example.SortTestHelper;
import com.java.algorithms.example.Student;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-04-08 10:34 AM
 */
public class InsertionSortTest {
    private int[] arr = SortTestHelper.generateRandomArray(10, 1, 20);

    @Test
    public void testInsertionSort() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = InsertionSort.insertionSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(beforeArr));
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }

    @Test
    public void testInsertionSortStudent(){
        Student[] arr = new Student[4];
        arr[0] = new Student("D", 68);
        arr[1] = new Student("C", 18);
        arr[2] = new Student("B", 80);
        arr[3] = new Student("A", 20);

        InsertionSort.insertionSortStudent(arr);
        System.out.println(Arrays.toString(arr));
    }
}