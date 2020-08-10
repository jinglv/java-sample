package com.example;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * <p>
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 *
 * @author jingLv
 * @date 2020/04/24
 */
public class Rotate {

    public static int[] rotate(int[] nums, int k) {
        int temp, previous;
        if (k <= 0) {
            System.out.println("参数非法");
            return nums;
        } else {
            for (int i = 0; i < k + 1; i++) {
                // 获取数组的最后一个元素
                previous = nums[nums.length - 1];
                for (int j = 0; j < nums.length; j++) {
                    // 循环，从数组头开始的元素与数组最后一个元素交换
                    temp = nums[j];
                    nums[j] = previous;
                    previous = temp;
                }
            }
        }
        return nums;
    }
}
