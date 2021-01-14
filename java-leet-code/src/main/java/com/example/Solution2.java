package com.example;

/**
 * @author jingLv
 * @date 2021/01/07
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] num = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};
        boolean b = lemonadeChange(num);
        System.out.println(b);
    }

    public static boolean lemonadeChange(int[] bills) {
        // 统计店员所拥有的5元和10元的数量（20元的不需要统计，
        // 因为顾客只能使用5元，10元和20元，而20元是没法给顾客找零的）
        int fiveCount = 0;
        int tenCount = 0;
        // 循环遍历拥有的纸币
        for (int bill : bills) {
            // 如果顾客使用的是5元，不用找零，5元数量加1
            if (bill == 5) {
                fiveCount++;
            } else if (bill == 10) {
                //如果顾客使用的是10元，需要找他5元，所以5元数量减1,10元数量加1
                fiveCount--;
                tenCount++;
            } else if (tenCount > 0) {
                //否则顾客使用的只能是20元，顾客使用20元的时候，如果我们有10元的，要尽量先给他10元的，然后再给他5元的，所以这里5元和10元数量都要减1
                fiveCount--;
                tenCount--;
            } else {
                //如果顾客使用的是20元，而店员没有10元的，就只能给他找3个5元的，所以5元的数量要减3
                fiveCount -= 3;
            }

            // 上面我们找零的时候并没有判断5元的数量，如果5元的数量小于0，说明上面某一步找零的时候5元的不够了，也就是说没法给顾客找零，直接返回false即可
            if (fiveCount < 0) {
                return false;
            }
        }
        return true;
    }
}
