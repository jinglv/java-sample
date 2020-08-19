package com.java.design.pattern.sample.decorator;

/**
 * @author jingLv
 * @date 2020/04/13
 */
public interface Person {

    /**
     * 累计消费
     *
     * @return 返回累积消费的金额
     */
    Double cost();

    /**
     * 展示
     */
    void show();
}
