package com.java.design.pattern.sample.decorator;

/**
 * 夹克
 * 具体的装饰类
 *
 * @author jingLv
 * @date 2020-04-13 7:06 PM
 */
public class Jacket extends ClothesDecorator {

    public Jacket(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        // 夹克累积金额100
        return person.cost() + 100;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("穿上夹克，累积消费：" + this.cost());
    }
}
