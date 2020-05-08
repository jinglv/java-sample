package com.example;

import org.junit.Test;

/**
 * @author jingLv
 * @date 2020-05-06 12:07 下午
 */
public class IsPalindromeTest {

    @Test
    public void isPalindrome() {
        int num = 1000021;
        boolean result = IsPalindrome.isPalindrome(num);
        System.out.println(result);
    }
}