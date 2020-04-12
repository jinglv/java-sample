package com.java.algorithms.example.sort.merge;

import com.java.algorithms.example.sort.SortTestHelper;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-04-08 3:25 PM
 */
public class MergeSortTest {

    private int[] arr = SortTestHelper.generateRandomArray(10, 1, 20);

    @Test
    public void testMergeSort() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = MergeSort.mergeSort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(beforeArr));
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }
}