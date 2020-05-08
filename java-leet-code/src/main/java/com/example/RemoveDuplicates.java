package com.example;

/**
 * 题目： 删除排序数组中的重复项
 * <p>
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * @author jingLv
 * @date 2020-04-23 10:42 AM
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int l = nums.length;

        // 假设数组的第一个元素为当前元素进行比较
        int current = nums[0];
        // 不重复元素初始长度
        int index = 1;
        // 如果数组只有一个元素则直接返回数组的长度
        if (l <= 1) {
            return l;
        } else {
            for (int i = 1; i < l; i++) {
                if (current != nums[i]) {
                    current = nums[i];
                    index++;
                }
            }
        }
        return index;
    }
}
