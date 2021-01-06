package com.demo.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingLv
 * @date 2021/01/06
 */
public class GenericDemo05 {
    public static void main(String[] args) {
        // 类型通配符：<?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("------------------------");
        // 类型通配符上限：<? extends 类型>
        // Object是父类，报错
        // List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("------------------------");
        // 类型通配符下限：<? super 类型>
        // Integer是Number的子类，报错
        // List<? super Number> list7 = new ArrayList<Integer>();
        List<? super Number> list8 = new ArrayList<Number>();
        List<? super Number> list9 = new ArrayList<Object>();
    }
}
