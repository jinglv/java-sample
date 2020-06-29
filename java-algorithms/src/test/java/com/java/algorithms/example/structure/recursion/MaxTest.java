package com.java.algorithms.example.structure.recursion;

import org.testng.annotations.Test;

/**
 * @author jinglv
 * @date 2020-04-12 13:42
 */
public class MaxTest {

    private static int[] arr = {24, 65, 22, 13, 76, 43, 88, 42, 57};

    @Test
    public void testMaxFor() {
        int max  =  Max.maxFor(arr);
        System.out.println(max);
    }

    @Test
    public void testFindMax(){
        int max = Max.findMax(arr, 0, arr.length-1);
        System.out.println(max);
    }
}