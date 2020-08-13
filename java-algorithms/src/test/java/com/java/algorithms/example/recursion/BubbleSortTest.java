package com.java.algorithms.example.recursion;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-06-24 3:49 下午
 */
public class BubbleSortTest {

    private static int[] arr = {24, 65, 22, 13, 76, 43, 88, 42, 57};

    @Test
    public void testBubbleSort() {
        BubbleSort.bubbleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}