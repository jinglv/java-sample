package com.example;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * @author jingLv
 * @date 2020/05/06
 */
public class IsPalindrome {

    /**
     * 判断一个整数是否是回文数
     * <p>
     * 思路：根据整数的长度，循环从第一位和最后一位进行比较，是否相等，直至只剩一位数
     *
     * @param num 需要判断的数字
     * @return 返回布尔值
     */
    public static boolean isPalindrome(int num) {
        // 获取整数的长度
        int l = String.valueOf(num).length();
        boolean flag = true;

        if (num < 0 || num % 10 == 0 && num != 0) {
            return false;
        }

        while (l > 1) {
            // 重新再获取整数的长度
            l = String.valueOf(num).length();
            // 获取整数的最后一位
            int lastNum = num % 10;
            // 获取整数的第一位
            int firstNum = (int) (num / (Math.pow(10, (l - 1))));
            if (lastNum != firstNum) {
                flag = false;
                break;
            }
            // 去掉整数的最后一位
            num = num / 10;
            // 去掉整数的首位
            num = (int) (num % (Math.pow(10, (l - 2))));
            l--;
        }
        return flag;
    }

    /**
     * 判断一个整数是否是回文数（官方版）
     *
     * @param num
     * @return
     */
    public static boolean isPalindromeOfficial(int num) {
        // 判断传入的整数不符合的条件(不符合的条件：num为负数 或者 num不为0且对10取余等于0)
        if (num < 0 || num % 10 == 0 && num != 0) {
            return false;
        }

        int temp = 0;
        while (num > temp) {
            temp = temp * 10 + num / 10;
            num = num / 10;
        }
        return num == temp || num == temp / 10;
    }
}