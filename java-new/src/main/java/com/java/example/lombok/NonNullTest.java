package com.java.example.lombok;

import lombok.NonNull;

/**
 * NonNull注解，生成非空的检查
 * 作用在方法的入参和属性上
 *
 * @author jingLv
 * @date 2020/11/06
 */
public class NonNullTest {

    public NonNullTest(@NonNull String field) {
        System.out.println(field);
    }
}
