package com.example;


import org.junit.Test;

/**
 * @author jingLv
 * @date 2020/08/12
 */
public class IsAnagramTest {
    public static String s = "anagram";
    public static String t = "nagaram";

    @Test
    public void testIsAnagramForSort() {
        Boolean flag = IsAnagram.isAnagramForSort(s, t);
        System.out.println(flag);
    }

    @Test
    public void testIsAnagramForHash() {
        Boolean flag = IsAnagram.isAnagramForHash(s, t);
        System.out.println(flag);
    }

    /**
     * 字符串拆分toCharArray()
     */
    @Test
    public void charArray01() {
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }

    /**
     * 字符串拆分charAt()
     */
    @Test
    public void charArray02() {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}