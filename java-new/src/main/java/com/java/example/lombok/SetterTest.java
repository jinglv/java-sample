package com.java.example.lombok;

import com.sun.istack.internal.NotNull;
import lombok.AccessLevel;
import lombok.Setter;

/**
 * Setter注解 为属性生成set方法
 * 可作用在类上或属性上
 * 作用在类上，为类下的所有属性生成set方法
 * 作用在属性上，只为这一个属性生成set方法
 *
 * @author jingLv
 * @date 2020/11/06
 */
public class SetterTest {

    @Setter
    private String field1;

    @Setter(value = AccessLevel.PRIVATE, onParam_ = {@NotNull})
    private String field2;

}
