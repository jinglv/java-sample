package com.java.algorithms.example.sort.shell;

import com.java.algorithms.example.sort.common.SortTestHelper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-04-09 5:12 PM
 */
public class ShellSortTest {

    private int[] arr = SortTestHelper.generateRandomArray(10, 1, 20);


    @Test
    public void testShellSort() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = ShellSort.shellSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(beforeArr));
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }
}