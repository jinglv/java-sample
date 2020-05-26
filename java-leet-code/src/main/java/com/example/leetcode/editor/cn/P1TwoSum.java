package com.example.leetcode.editor.cn;
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

import java.util.Arrays;

public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        // TO TEST
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        System.out.println(Arrays.toString(solution.twoSumOne(nums, target)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 暴利，双循环，元素之间比较
         * 时间复杂度O(n^2)
         *
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSumOne(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (target == nums[j] + nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}