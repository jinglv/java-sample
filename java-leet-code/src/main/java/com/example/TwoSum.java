package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author jinglv
 * @date 2020/05/04
 */
public class TwoSum {

    public static int[] twoSumFor(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
     *
     * @param nums   数组
     * @param target 目标值
     * @return 返回下标数组
     */
    public static int[] twoSum(int[] nums, int target) {
        // 声明一个HashMap
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //将数组的元素和下标，保存到Map中{key(元素):value(下标)}
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            // 判断temp的值是否包含在map中，并且temp的数值的下标不能与当前的相等
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{i, map.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
     *
     * @param nums   数组
     * @param target 目标值
     * @return 返回下标数组
     */
    public static int[] twoSumPlus(int[] nums, int target) {
        // 声明HashMap，用来存在遍历数组的元素和下标{key(元素):value(下标)}
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            // 判断temp的值是否包含在map中
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
