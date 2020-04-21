package com.java.algorithms.example.structure.recursion;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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