package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jinglv
 * @date 2020-05-04 1:41 下午
 */
public class TwoSumTest {

    @Test
    public void testTwoSumFor() {
        int[] nums = {2, 7, 11, 15};
        int[] ints = TwoSum.twoSumFor(nums, 26);
        System.out.println(ints[0] +"; "+ ints[1]);
        Assert.assertEquals(2, ints[0]);
        Assert.assertEquals(3, ints[1]);

    }

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int[] ints = TwoSum.twoSum(nums, 13);
        System.out.println(ints[0] +"; "+ ints[1]);
        Assert.assertEquals(0, ints[0]);
        Assert.assertEquals(2, ints[1]);

    }

    @Test
    public void testTwoSumPlus() {
        int[] nums = {2, 7, 11, 15};
        int[] ints = TwoSum.twoSumPlus(nums, 9);
        System.out.println(ints[0] +"; "+ ints[1]);
        Assert.assertEquals(0, ints[0]);
        Assert.assertEquals(1, ints[1]);

    }

}