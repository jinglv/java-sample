package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinglv
 * @date 2020-05-04 2:25 下午
 */
public class ReverseTest {

    @Test
    public void reverse() {
        int num = Reverse.reverseStr(123);
        System.out.println(num);
        Assert.assertEquals(321, num);
    }

    @Test
    public void reverseHaveZero() {
        int num = Reverse.reverseStr(-1230);
        System.out.println(num);
        Assert.assertEquals(-321, num);
    }

    @Test
    public void reverseHaveZero1() {
        int num = Reverse.reverseStr(12230);
        System.out.println(num);
        Assert.assertEquals(3221, num);
    }
}