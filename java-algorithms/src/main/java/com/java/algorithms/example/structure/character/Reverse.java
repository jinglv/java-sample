package com.java.algorithms.example.structure.character;

/**
 * 字符串反转
 * 1.先将字符串拆分为字符数组
 * 2.用两个指针，一个指向字符串的第一个字符，一个指向它的最后一个字符，然后互相交换。交换之后，两个指针向中央一步步地靠拢并相互交换字符，直到两个指针相遇。这是一种比较快速和直观的方法
 * 3.将字符数组合并为字符串
 *
 * @author jingLv
 * @date 2020/08/12
 */
public class Reverse {

    /**
     * 字符串反转
     *
     * @param str 需要反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
        // 将字符串拆分为字符数组
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        StringBuilder mergeStr = new StringBuilder();
        for (char aChar : chars) {
            mergeStr.append(aChar);
        }
        return String.valueOf(mergeStr);
    }
}
