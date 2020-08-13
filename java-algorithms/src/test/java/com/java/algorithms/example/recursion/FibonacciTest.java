package com.java.algorithms.example.recursion;

import org.testng.annotations.Test;

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