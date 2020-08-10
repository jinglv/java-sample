package com.example;

/**
 * 给定一个haystack字符串和一个needle字符串，在haystack字符串中找出needle字符串出现的第一个位置 (从0开始)。如果不存在，则返回-1
 * <p>
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * <p>
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * @author jingLv
 * @date 2020/04/03
 */
public class StrStr {
    public static int strStr(String hayStack, String needle) {
        int h = hayStack.length(), n = needle.length();

        for (int i = 0; i < n - h - 1; ++i) {

            if (hayStack.substring(i, i + h).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
