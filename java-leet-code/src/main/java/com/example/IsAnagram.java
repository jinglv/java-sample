package com.example;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * <p>
 * 说明:假设字符串只包含小写字母。
 * <p>
 * 字母异位词，也就是两个字符串中的相同字符的数量要对应相等。
 *
 * @author jingLv
 * @date 2020/08/12
 */
public class IsAnagram {

    /**
     * 通过排序的方法，判断t是否是s的字母异位词
     * 1.将字符串拆分为字符数组
     * 2.将字符串进行排序，并判断
     *
     * @param s
     * @param t
     * @return 返回布尔值
     */
    public static Boolean isAnagramForSort(String s, String t) {
        // 判断两个字符串长度，如果不等，则直接返回失败
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    /**
     * 通过哈希表的方式，判断t是否是s的字母异位词
     * 重要的前提“假设两个字符串只包含小写字母”，小写字母一共也就 26 个
     * 1.可以利用两个长度都为 26 的字符数组来统计每个字符串中小写字母出现的次数，然后再对比是否相等
     * 2.可以只利用一个长度为 26 的字符数组，将出现在字符串 s 里的字符个数加 1，而出现在字符串 t 里的字符个数减 1，最后判断每个小写字母的个数是否都为 0
     *
     * @param s
     * @param t
     * @return 返回布尔值
     */
    public static Boolean isAnagramForHash(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // 计数器
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.toCharArray()[i] - 'a']++;
            counter[t.toCharArray()[i] - 'a']--;
        }
        for (int c : counter) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
