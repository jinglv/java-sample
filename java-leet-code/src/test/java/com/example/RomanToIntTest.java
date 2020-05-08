package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 示例 1:
 * * 输入: "III"
 * * 输出: 3
 * * <p>
 * * 示例 2:
 * * 输入: "IV"
 * * 输出: 4
 * * <p>
 * * 示例 3:
 * * 输入: "IX"
 * * 输出: 9
 * * <p>
 * * 示例 4:
 * * 输入: "LVIII"
 * * 输出: 58
 * * 解释: L = 50, V= 5, III = 3.
 * * <p>
 * * 示例 5:
 * * 输入: "MCMXCIV"
 * * 输出: 1994
 * * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * @author jingLv
 * @date 2020-05-07 3:57 下午
 */
public class RomanToIntTest {

    @Test
    public void romanToInt1() {
        int result = RomanToInt.romanToInt("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void romanToInt2() {
        int result = RomanToInt.romanToInt("IV");
        Assert.assertEquals(4, result);
    }

    @Test
    public void romanToInt3() {
        int result = RomanToInt.romanToInt("IX");
        Assert.assertEquals(9, result);
    }

    @Test
    public void romanToInt4() {
        int result = RomanToInt.romanToInt("LVIII");
        Assert.assertEquals(58, result);
    }

    @Test
    public void romanToInt5() {
        int result = RomanToInt.romanToInt("MCMXCIV");
        Assert.assertEquals(1994, result);
    }

    /**
     * Java substring的练习
     *
     * public String substring(int beginIndex)
     * 或
     * public String substring(int beginIndex, int endIndex)
     *
     * - beginIndex -- 起始索引（包括）, 索引从 0 开始。
     * - endIndex -- 结束索引（不包括）。
     *
     * 例子：
     * 字符串：MCMXCIV
     * 下标： 0123456
     */
    @Test
    public void substringTest01(){
        String str = "MCMXCIV";
        System.out.println(str.substring(0, 2));
    }
}