package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(binaryGap(8));
    }

    public static int binaryGap(int n) {
        // 现在将整数转为二进制，返回一个二进制字符串
        String binaryString = Integer.toBinaryString(n);
        // 再将二进制字符串拆分为字符数组
        char[] chars = binaryString.toCharArray();
        // 数组用来记录1的索引值
        List<Integer> arr = new ArrayList<>();
        // 计数器记录1的个数
        int one = 0;
        // 遍历二进制字符串，取出1，放到arr里
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                arr.add(i);
                one++;
            }
        }
        // 如果1的个数小于2，则返回0
        if (one < 2) {
            return 0;
        }
        int max = 1;
        // 循环遍历，相邻的两个1的索引相减，比较后得出的则是最大值
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) > max) {
                max = arr.get(i + 1) - arr.get(i);
            }
        }
        return max;
    }
}
