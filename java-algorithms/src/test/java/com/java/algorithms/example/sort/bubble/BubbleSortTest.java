package com.java.algorithms.example.sort.bubble;

import com.java.algorithms.example.sort.SortTestHelper;
import com.java.algorithms.example.sort.Student;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author jinglv
 * @date 2020-04-06 16:45
 */
public class BubbleSortTest {

    private int[] arr = SortTestHelper.generateRandomArray(10, 1, 20);


    @Test
    public void testBubbleSort() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = BubbleSort.bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(beforeArr));
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }

    @Test
    public void testBubbleSortPlus() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = BubbleSort.bubbleSortPlus(arr);
        System.out.println(Arrays.toString(beforeArr));
        long endTime = System.currentTimeMillis();
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }

    @Test
    public void testBubbleSortPlus2() {
        System.out.println("-------------排序前的数组----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------排序后的数组----------------");
        assert arr != null;
        long startTime = System.currentTimeMillis();
        int[] beforeArr = BubbleSort.bubbleSortPlus2(arr);
        System.out.println(Arrays.toString(beforeArr));
        long endTime = System.currentTimeMillis();
        System.out.println("排序花费的时间：" + (endTime - startTime));
    }

    @Test
    public void testBubbleSortObject() {
        Student[] arr = new Student[4];
        arr[0] = new Student("D", 90);
        arr[1] = new Student("C", 100);
        arr[2] = new Student("B", 95);
        arr[3] = new Student("A", 88);

        BubbleSort.bubbleSortStudent(arr);
        System.out.println(Arrays.toString(arr));
    }
}