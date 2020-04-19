package com.java.design.pattern.sample.decorator;

/**
 * 被装饰的对象
 *
 * @author jingLv
 * @date 2020-04-13 7:01 PM
 */
public class Lily implements Person {
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("我是莉莉……");
    }
}
