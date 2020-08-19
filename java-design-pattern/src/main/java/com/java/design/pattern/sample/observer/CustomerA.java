package com.java.design.pattern.sample.observer;

/**
 * @author jingLv
 * @date 2020/04/21
 */
public class CustomerA extends Customer {
    @Override
    public void update() {
        System.out.println("我是客户A，我收到报纸啦。。。");
    }
}
