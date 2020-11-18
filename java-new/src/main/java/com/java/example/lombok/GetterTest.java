package com.java.example.lombok;

import com.sun.istack.internal.NotNull;
import lombok.AccessLevel;
import lombok.Getter;

/**
 * Getter注解 为属性生成get方法
 * 可作用在类上或属性上
 * 作用在类上，为类下的所有属性生成get方法
 * 作用在属性上，只为这一个属性生成get方法
 *
 * @author jingLv
 * @date 2020/11/06
 */
public class GetterTest {

    @Getter(lazy = true)
    private final String field1 = "xiaohong";

    @Getter(value = AccessLevel.PRIVATE, onMethod_ = {@NotNull})
    private String field2;

    @Getter
    private String field3;

}
