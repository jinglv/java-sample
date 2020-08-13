package com.java.algorithms.example.structure.character;

import org.testng.annotations.Test;

/**
 * @author jingLv
 * @date 2020/08/12
 */
public class ReverseTest {

    @Test
    public void testReverse() {
        String str = "rac";
        System.out.println(str);
        String reStr = Reverse.reverse(str);
        System.out.println("-----------反转后-----------");
        System.out.println(reStr);
    }
}