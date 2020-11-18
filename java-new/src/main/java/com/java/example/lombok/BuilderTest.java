package com.java.example.lombok;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

/**
 * Builder和Singular注解
 * Builder注解，将对象创建和对象的使用完全分离，对象的创建只能用Builder创建，创建完成对象不可变，只能对这个对象使用，不能再对这个对象进行更改
 *
 * @author jingLv
 * @date 2020/11/06
 */
@Builder
@Getter
public class BuilderTest {

    /**
     * 静态属性，不能赋值
     */
    private static String staticField;

    /**
     * final属性
     */
    private final String finalField;

    /**
     * 已初始化的final属性，不能赋值
     */
    private final String initFinalField = "已初始化的final字段";

    /**
     * 普通属性
     */
    private String field;

    /**
     * 集合类的属性，注意：括号里带字段名
     */
    @Singular("listField")
    private List<String> listField;

    /**
     * main方法
     *
     * @param args
     */
    public static void main(String[] args) {
        BuilderTest build = BuilderTest
                // builder创建一个可以链式赋值的对象
                .builder()
                // 为这个对象的"每个"字段赋值
                .finalField("手动赋值FinalField字段")
                .field("手动赋值Field字段")
                .listField("xiaohong")
                // build方法来创建对象。完成了对象的创建。此时创建出来的对象是不可变的！
                .build();
        System.out.println(JSON.toJSONString(build, true));
    }
}

