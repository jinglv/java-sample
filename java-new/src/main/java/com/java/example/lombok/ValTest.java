package com.java.example.lombok;

import lombok.val;

import java.util.ArrayList;

/**
 * Val注解，弱语言中的变量声明，可以接收任何类型的参数
 * 作用在本地方法
 * 通过变量的值推断出变量的类型是什么
 *
 * @author jingLv
 * @date 2020/11/06
 */
public class ValTest {

    public ValTest() {
        val field = "xiaohong";
        val list = new ArrayList<String>();
        list.add(field);
    }

}
