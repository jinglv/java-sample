package com.example;

/**
 * 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * <p>
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * <p>
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * @author jinglv
 * @date 2020/05/04
 */
public class Reverse {

    /**
     * 这种方式对负数处理失败
     *
     * @param num 需要反转的数
     * @return 返回已反转的数
     */
    public static int reverseStr(int num) {
        // 将数字转为字符串
        String s = String.valueOf(num);
        // 将字符串拆分为字符数组
        char[] chars = s.toCharArray();
        // 创建一个数组用来存储字符数组转换的数字数组
        int[] nums = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            // 字符转换，并存储到数组nums
            nums[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        // 数组遍历前后交换
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // 字符串合并
        StringBuilder str = new StringBuilder();
        for (int value : nums) {
            str.append(value);
        }
        // 字符串转int
        return Integer.parseInt(str.toString());
    }

    /**
     * 依次取出当前数字的最后一位数，累加。
     * 关键在于如何判断整数溢出：将每次操作后的数字用临时变量存储，对该变量“反操作”，若与操作前的结果不等，则发生溢出，直接返回0
     *
     * @param num 需要反转的数字
     * @return 返回已反转的数字
     */
    public static int reverse(int num) {
        int result = 0;
        while (num != 0) {
            // 每轮循环通过取模将数字的最后一位取出，在加上上一轮循环取出数字乘以10
            int temp = (num % 10) + (result * 10);
            if (((temp - (num % 10)) / 10) != result) {
                return 0;
            }
            result = temp;
            num /= 10;
        }
        return result;
    }
}
