package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-23 10:51 AM
 */
public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesOne() {
        int[] nums = {1,1,2};
        System.out.println(nums.length);
        System.out.println(RemoveDuplicates.removeDuplicates(nums));
    }

    @Test
    public void testRemoveDuplicatesTwo() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(nums.length);
        System.out.println(RemoveDuplicates.removeDuplicates(nums));
    }
}