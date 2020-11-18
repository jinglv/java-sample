package com.java.example.lombok;

import lombok.EqualsAndHashCode;

/**
 * EqualsAndHashCodeTest注解，生成Equals方法和HashCode方法
 * 作用在类上
 *
 * @author jingLv
 * @date 2020/11/06
 */
@EqualsAndHashCode(
        exclude = {"field1"}
)
public class EqualsAndHashCodeTest {
    private String field1;
    private String field2;
}
