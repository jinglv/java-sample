package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jinglv
 * @date 2020-05-04 2:25 下午
 */
public class ReverseTest {

    @Test
    public void reverse() {
        int num = Reverse.reverse(123);
        System.out.println(num);
        Assert.assertEquals(321, num);
    }

    @Test
    public void reverseHaveZero() {
        int num = Reverse.reverse(1230);
        System.out.println(num);
        Assert.assertEquals(321, num);
    }

    @Test
    public void reverseHaveZero1() {
        int num = Reverse.reverse(12230);
        System.out.println(num);
        Assert.assertEquals(3221, num);
    }
}