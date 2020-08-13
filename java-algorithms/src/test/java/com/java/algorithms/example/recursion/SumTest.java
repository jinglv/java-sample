package com.java.algorithms.example.recursion;

import org.testng.annotations.Test;

/**
 * @author jinglv
 * @date 2020-04-12 13:27
 */
public class SumTest {

    @Test
    public void testSumFor() {
        int sum = Sum.sumFor(100);
        System.out.println(sum);
    }

    @Test
    public void testSumRecursion() {
        int sum = Sum.sumRecursion(100);
        System.out.println(sum);
    }
}