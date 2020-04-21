package com.java.design.pattern.sample.observer;

/**
 * @author jingLv
 * @date 2020-04-21 3:50 PM
 */
public class CustomerB extends Customer
{
    @Override
    public void update() {
        System.out.println("我是客户B，我收到报纸啦。。。");
    }
}
