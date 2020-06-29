package com.java.algorithms.example.structure.recursion;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author jingLv
 * @date 2020-06-24 4:06 下午
 */
public class FibonacciTest {

    @Test
    public void testFibonacci() {
        int fibonacci = Fibonacci.fibonacci(10);
        System.out.println(fibonacci);
    }
}