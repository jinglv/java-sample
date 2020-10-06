package com.example.hutool.convert;

import cn.hutool.core.convert.Convert;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

/**
 * 测试Hutool中的类型转换
 *
 * @author jinglv
 * @date 2020/10/06
 */
public class TestConvert {

    /**
     * 转换为字符串
     */
    @Test
    void testConvertStr() {
        // int转为String
        int a = 1;
        String aStr = Convert.toStr(a);
        System.out.println(aStr);

        // 数组转为String
        long[] b = {1, 2, 3, 4, 5};
        String bStr = Convert.toStr(b);
        // bStr为"[1, 2, 3, 4, 5]"
        System.out.println(bStr);
    }

    /**
     * 转换为指定类型数组
     */
    @Test
    void testConvertArray() {
        String[] b = {"1", "2", "3", "4"};
        //结果为Integer数组
        Integer[] bIntArray = Convert.toIntArray(b);
        for (Integer integer : bIntArray) {
            System.out.println(integer);
        }

        long[] c = {1, 2, 3, 4, 5};
        //结果为Integer数组
        Integer[] cIntArray = Convert.toIntArray(c);
        for (Integer integer : cIntArray) {
            System.out.println(integer);
        }
    }

    /**
     * 字符串转换为日期对象
     */
    @Test
    void testConvertDate() {
        String dateStr = "2020-10-06";
        Date date = Convert.toDate(dateStr);
        System.out.println(date);

        String dateStr2 = "2020/10/06";
        Date date1 = Convert.toDate(dateStr2);
        System.out.println(date1);
    }

    /**
     * 数组转换为集合
     */
    @Test
    void testConvertCollection() {
        String[] strings = {"may", "jack", "jay"};
        List<?> toList = Convert.toList(strings);
        toList.forEach(System.out::println);

        Integer[] integers = {12, 34, 56};
        List<?> list = Convert.toList(integers);
        list.forEach(System.out::println);
    }
}
