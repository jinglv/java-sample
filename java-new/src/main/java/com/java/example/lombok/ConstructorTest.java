package com.java.example.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 三种构造函数注解
 * AllArgsConstructor -- 全参构造函数
 * NoArgsConstructor -- 无参构造函数
 * RequiredArgsConstructor -- 必要参数的构造函数
 *
 * @author jingLv
 * @date 2020/11/06
 */
@RequiredArgsConstructor
public class ConstructorTest {

    // final类型的，在构造的时候必须初始化
    private final String field1;

    // 非空校验的，构造的时候也必须初始化
    @NonNull
    private String field2;

    private String field3;
}
