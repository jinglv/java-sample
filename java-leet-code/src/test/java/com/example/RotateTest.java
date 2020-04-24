package com.example;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jingLv
 * @date 2020-04-24 3:37 PM
 */
public class RotateTest {

    @Test
    public void rotate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(Rotate.rotate(nums, 3)));
    }
}